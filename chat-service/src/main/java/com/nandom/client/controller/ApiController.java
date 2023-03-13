package com.nandom.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class ApiController {

    @GetMapping("")
    public Map getIndex() {
        return Collections.singletonMap("name", "Joseph");
    }
}
