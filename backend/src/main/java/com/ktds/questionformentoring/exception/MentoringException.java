package com.ktds.questionformentoring.exception;

import lombok.Getter;

@Getter
public class MentoringException extends RuntimeException {

    private MentoringErrorCode mentoringErrorCode;
    private String detailMessage;

    public MentoringException(MentoringErrorCode errorCode) {
        super(errorCode.getMessage());
        this.mentoringErrorCode = errorCode;
        this.detailMessage = errorCode.getMessage();
    }

    public MentoringException(MentoringErrorCode errorCode, String detailMessage) {
        super(errorCode.getMessage());
        this.mentoringErrorCode = errorCode;
        this.detailMessage = detailMessage;
    }
}
