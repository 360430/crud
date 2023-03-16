package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/14/20:23
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        int code = flag ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = flag ? "" : "添加有误 请重试！";
        return new Result(code, flag, msg);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        boolean flag = bookService.delete(id);
        int code = flag ? Code.DELETE_OK : Code.DELETE_ERR;
        String msg = flag ? "" : "删除有误 请重试！";
        return new Result(code, flag, msg);

    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        int code = flag ? Code.UPDATE_OK : Code.UPDATE_ERR;
        String msg = flag ? "" : "修改有误 请重试！";
        return new Result(code, flag, msg);
    }

    @GetMapping
    public Result findAll() {
        List<Book> bookList = bookService.findAll();
        int code = bookList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = bookList != null ? "" : "查询失败，请重试";
        return new Result(code, bookList, msg);
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable int id) {
        Book book = bookService.findById(id);
        int code = book != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = book != null ? "" : "查询失败，请重试";
        return new Result(code, book, msg);
    }
}
