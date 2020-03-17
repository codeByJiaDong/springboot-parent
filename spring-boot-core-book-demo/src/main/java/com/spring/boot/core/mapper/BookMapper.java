package com.spring.boot.core.mapper;

import com.spring.boot.core.dto.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Description TODO
 * @Date 2020/3/17 14:00
 * @auther by Dong
 */
public interface BookMapper extends PagingAndSortingRepository<Book,Long> {
}
