package com.zzh1ad.controller;

import com.zzh1ad.entity.TableData;
import com.zzh1ad.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService service;

    @PostMapping
    public void insert(){
        service.insert();
    }

    @GetMapping
    public List<TableData> getPage(){
        return service.getPage();
    }
}
