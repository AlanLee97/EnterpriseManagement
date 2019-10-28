package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class ChatData {
    @Getter @Setter
    private int code;

    @Getter @Setter
    private String msg;

    @Getter @Setter
    private Data data;

    public ChatData() {
    }

    public ChatData(int code, String msg, Data data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static class Data{
        @Getter @Setter
        public String content;

        public Data() {
        }

        public Data(String content) {
            this.content = content;
        }
    }
}
