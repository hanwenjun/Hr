package com.example.demo.repository;

import com.example.demo.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by JUN on 2020/4/27.
 */
public interface DeptRepository extends JpaRepository<Dept,Integer>{
}
