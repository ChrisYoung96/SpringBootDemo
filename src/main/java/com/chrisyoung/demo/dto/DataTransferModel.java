package com.chrisyoung.demo.dto;

import com.chrisyoung.demo.domain.City;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:18
 * @description: 客户端与服务器进行数据交互的对象
 **/


public class DataTransferModel<T> {
    private T data;
    private int optCode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getOptCode() {
        return optCode;
    }

    public void setOptCode(int optCode) {
        this.optCode = optCode;
    }
}
