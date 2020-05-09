package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by JUN on 2020/4/27.
 */
@SpringBootTest
public class DeptRepositoryTest {
    @Autowired
    private DeptRepository deptRepository;

    @Test
    void findAll(){
        System.out.println(deptRepository.findAll());
    }
}