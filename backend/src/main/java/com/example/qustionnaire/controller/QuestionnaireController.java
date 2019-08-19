package com.example.qustionnaire.controller;

import com.example.qustionnaire.entity.Node;
import com.example.qustionnaire.entity.Person;
import com.example.qustionnaire.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/backend")
public class QuestionnaireController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/questionnaire")
    public String question(@RequestParam("callback") String callback) throws Exception{
        String result="{\"RecordCount\":1,\"Data\":[{\"name\":\"samson\"},{\"gender\":\"male\"}]}";
        return callback+"("+result+")";
    }

    @GetMapping("/nodes")
    public String node(@RequestParam("callback") String callback,
                       @RequestParam("tid") String tid,
                       @RequestParam("text") String text,
                       @RequestParam("leaf") String leaf,
                       @RequestParam("parentId") String parentId) throws Exception{
        Node node =new Node(tid,text,leaf,parentId);
        studentRepository.save(node);
        String result = callback+"({\"RecordCount\":"+studentRepository.findAll().size()+",\"Data\":[";
        List<Node> nodes = studentRepository.findAll();
        result+=nodes+"]})";
        return result;
    }

    @PostMapping
    public List<Node> nodes(@RequestBody  Node node){
        System.out.println(node);
        studentRepository.save(node);
        return studentRepository.findAll();
    }

}
