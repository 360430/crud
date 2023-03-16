package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/14/20:22
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public List<Book> findAll() {
        /**
         * 自定义异常的系统异常
         */
      /*  try {
            int i=1/0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_ERR,"网络异常 请稍后重试！");

        }*/
        List<Book> all = bookDao.findAll();
        return all;
    }

    @Override
    public Book findById(int id) {
        /**
         * 自定义异常的业务员逻辑异常
         */
        if (id==0){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要一直玩弄id");
        }
        Book byId = bookDao.findById(id);
        return byId;
    }
}
