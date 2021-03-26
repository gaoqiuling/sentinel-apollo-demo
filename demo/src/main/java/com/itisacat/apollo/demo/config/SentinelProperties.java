package com.itisacat.apollo.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SentinelProperties {

    /**
     * 订单支付超时时长，单位：秒。
     */
   @Value("${SampleApp-flow-rules:''}")
    private String flowRules;

    /**
     * 订单创建频率，单位：秒
     */
    private Integer createFrequencySeconds;


    public String getFlowRules() {
        return flowRules;
    }
}
