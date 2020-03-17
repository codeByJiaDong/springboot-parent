package com.spring.boot.core.controller;


import com.spring.boot.core.dto.Book;
import com.spring.boot.core.mapper.BookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description TODO
 * @Date 2020/3/17 14:03
 * @auther by Dong
 */
@RestController("book")
public class BookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);
    @Autowired
    BookMapper bookMapper;
    @GetMapping("/query")
    public Page<Book> findByPage(Pageable pageable){

        LOGGER.info("分页查询用户：PageNum="+pageable.getPageNumber() +
                "PageSize="+pageable.getPageSize()+"");
        return bookMapper.findAll(pageable);
    }
}
