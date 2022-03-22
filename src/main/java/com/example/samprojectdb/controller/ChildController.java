package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.Child;
import com.example.samprojectdb.repository.ChildRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @RequestMapping("/findAll")
    public List<Child> findAll()
    {
        return childRepo.findAll();
    }

    @RequestMapping("/findByName/{name}")
    public Child findChildByName(@PathVariable("name") String name)
    {
        return childRepo.findChildByName(name);
    }

}
