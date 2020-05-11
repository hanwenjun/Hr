package com.example.demo.controller;

import com.example.demo.entity.Dept;
import com.example.demo.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * Created by JUN on 2020/4/27.
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptRepository deptRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Dept> queryAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
         PageRequest request = PageRequest.of(page,size);
        return deptRepository.findAll(request);
    }

    @PostMapping("/saveDept")
    public String save(@RequestBody Dept dept){
        Dept result = deptRepository.save(dept);
        if(result !=null){
            return "success";
        }else{
            return "fail";
        }
    }
    
    @GetMapping("/findById/{deptno}")
    public Dept findById(@PathVariable("deptno") Integer deptno) {
    	return deptRepository.findById(deptno).get();
    }
    
    @PutMapping("/update")
    public String update(@RequestBody Dept dept) {
    	Dept result = deptRepository.save(dept);
    		if(result !=null){
    			return "success";
    		}else{
    			return "fail";
    		}
    }
}
