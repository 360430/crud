package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.controller.BookController;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/18:52
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookTest {
    @Autowired
    private BookService bookService;
    @Test
    public void test1(){
        List<Book> all = bookService.findAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
