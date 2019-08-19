package com.example.qustionnaire.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_TREE")
public class Node {

    @Id
    private String tid;

    private String text;

    private String leaf;

    private String parentId;

    public Node() {
    }

    public Node(String tid, String text, String leaf, String parentId) {
        this.tid = tid;
        this.text = text;
        this.leaf = leaf;
        this.parentId = parentId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String toString(){
        String str="{\"tid\":"+"\""+tid+"\""+",\"text\":"+"\""+text+"\""+",\"leaf\":"+"\""+leaf+"\""+",\"parentId\":"+"\""+parentId+"\""+"}";
        return str;
    }
}
