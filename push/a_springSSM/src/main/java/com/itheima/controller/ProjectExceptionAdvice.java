package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/20:04
 * @Description:
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public Result doSystemException(SystemException systemException){
        return new Result(systemException.getCode(),systemException.getMessage());
    }
    @ExceptionHandler
    public Result doBusinessException(BusinessException businessException){
        return new Result(businessException.getCode(),businessException.getMessage());
    }
}
