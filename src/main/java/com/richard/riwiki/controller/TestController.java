package com.richard.riwiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1  -- Traditional Ways
     * /user/1     -- RESTful ways
     * @return
     */
    // @PostMapping
    // @PutMapping
    // @DeleteMapping
    // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
    // http://127.0.0.1:8880/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World! Post, " + name;
    }
}
