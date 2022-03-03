package com.example.samprojectdb.controller;

import com.example.samprojectdb.repository.ChildRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child")
public class ChildController {
    @Autowired
    private ChildRepo childRepo;

//    @RequestMapping("/demo")
//    public void display()
//    {
//        System.out.println(childRepo.findAll().toString());
//    }

}
