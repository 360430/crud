package com.itheima.exception;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/19:31
 * @Description:
 */
public class SystemException extends RuntimeException{
    private int code;

    public SystemException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
