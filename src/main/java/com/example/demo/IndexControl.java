package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexControl   {

@GetMapping("/")
public String Index(Map<String ,String> map){

    map.put("name","wangpw  hello111" );

    return "index";
}

}
