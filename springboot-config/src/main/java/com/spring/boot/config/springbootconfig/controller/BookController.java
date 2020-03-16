package com.spring.boot.config.springbootconfig.controller;

import com.spring.boot.config.springbootconfig.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/3/16 16:00
 * @auther by Dong
 */
@RestController
public class BookController {
    @Autowired
    BookProperties bookProperties;

    @GetMapping("/book/hello")
    public String sayHello(){
        return "书名"+bookProperties.getName()+",它的作者是"+bookProperties.getWriter();
    }
}
