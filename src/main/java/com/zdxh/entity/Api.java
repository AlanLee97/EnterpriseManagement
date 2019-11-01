package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class Api<T> {
    @Setter @Getter
    private int code;

    @Setter @Getter
    private String msg;

    @Setter @Getter
    private T data;

    public Api() {
    }

    public Api(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Api{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
