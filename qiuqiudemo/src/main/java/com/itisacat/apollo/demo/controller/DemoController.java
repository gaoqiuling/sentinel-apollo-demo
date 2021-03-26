package com.itisacat.apollo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    // 测试【流量控制】
    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }

    @GetMapping("/echo/{id}/info")
    public String echoInfo(@PathVariable Integer id) {
        return "echo" + id;
    }
}
