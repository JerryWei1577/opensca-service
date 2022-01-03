package com.duoduo.opensca.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : duoduo
 * @Date : 2022/1/3
 */

@RestController
@RequestMapping(value = "")
public class HeathController {

    @GetMapping(value = "")
    public String home() {
        return "欢迎访问opensca,请参考API文档";
    }

    @GetMapping(value = "health")
    public String health() {
        return "ready";
    }

}
