package com.spring.boot.config.springbootconfig;

import com.spring.boot.config.springbootconfig.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description TODO
 * @Date 2020/3/16 16:05
 * @auther by Dong
 */
@RunWith(SpringRunner.class)
@SpringBootTest("com.spring.boot.config.springbootconfg")
public class ConfigTest {

    @Autowired
    BookController bookController;
    @Test
    public void testBook(){
        System.out.println(bookController.sayHello());
    }

}
