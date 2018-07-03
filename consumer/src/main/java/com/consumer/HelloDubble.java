package com.consumer;

import com.api.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hua wb on 2018/7/3.
 */
@Controller
@RequestMapping
public class HelloDubble {
    @Autowired
    private Hello demoService;
    @RequestMapping("/dubbo")
    @ResponseBody
    public String sayHello() {
        String s = demoService.say();
        return s;
    }

}
