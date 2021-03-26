package com.itisacat.apollo.demo.controller;

import com.itisacat.apollo.demo.config.SentinelProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private SentinelProperties properties;

    // 测试【流量控制】
    @GetMapping("/echo")
    public String echo() {
//        Entry entry = null;
//        try {
//            // 若需要配置例外项，则传入的参数只支持基本类型。
//            // EntryType 代表流量类型，其中系统规则只对 IN 类型的埋点生效
//            // count 大多数情况都填 1，代表统计为一次调用。
//            entry = SphU.entry("qq", EntryType.IN, 1);
//            // Your logic here.
//        } catch (BlockException ex) {
//            // Handle request rejection.
//        } finally {
//            // 注意：exit 的时候也一定要带上对应的参数，否则可能会有统计错误。
//            if (entry != null) {
//                entry.exit(1);
//            }
//        }
        return "echo";
    }

    @GetMapping("/info")
    public String getInfo() {
        return properties.getFlowRules();
    }


}
