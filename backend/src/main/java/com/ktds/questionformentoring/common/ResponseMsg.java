package com.ktds.questionformentoring.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseMsg {
    private int code;
    private String msg;
    private Object resData;

    public ResponseMsg(String msg, Object resData) {
        this.code = 1;
        this.msg = msg;
        this.resData = resData;
    }

    public ResponseMsg(String msg) {
        this.code = 1;
        this.msg = msg;
    }

    public ResponseMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseMsg(int code, String msg, Object resData) {
        this.code = code;
        this.msg = msg;
        this.resData = resData;
    }
}