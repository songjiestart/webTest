package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: songjie
 * @Date: 2019-05-05 16:02
 * @Description:
 */
@RequestMapping("/")
@Controller
public class TestController {

    @RequestMapping("/str12")
    @ResponseBody
    public String test(){
        return "xxxx\r\nsss7777xs22d<br>w242133<br>123<br>xxxx";
    }
}
