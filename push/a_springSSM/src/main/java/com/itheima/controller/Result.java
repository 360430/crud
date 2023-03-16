package com.itheima.controller;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/19:49
 * @Description:
 */
public class Result {
private int code;
private Object data;
private String msg;

    public Result(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
