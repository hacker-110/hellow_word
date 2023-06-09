package com.example.hellow_word.exception;

import lombok.Getter;

@Getter
public class Errors extends RuntimeException {
    private int code;

    public Errors(int code, String message) {
        super(message);
        this.code = code;
    }
}
