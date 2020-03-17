package com.spring.boot.config.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description TODO
 * @Date 2020/3/16 15:57
 * @auther by Dong
 */
@Component
@ConfigurationProperties(prefix = "demo.book")
@Validated
public class BookProperties {

    /**
     * 书名
     */
    //@Value("${demo.book.name}")
    @NotNull
    private String name;


    /**
     * 作者
     */
    @NotEmpty
    //@Value("${demo.book.writer}")
    private String writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


}
