package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/14/20:21
 * @Description:
 */
@Transactional
public interface BookService {
    //添加
    public boolean save(Book book);
    //删除
    public boolean delete(int id);
    //修改
    public boolean update(Book book);
    //查询所有
    public List<Book> findAll();
    //id查询
    public Book findById(int id);

}
