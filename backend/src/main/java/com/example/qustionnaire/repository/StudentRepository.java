package com.example.qustionnaire.repository;

import com.example.qustionnaire.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Node,String> {
}
