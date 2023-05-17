package com.example.hellow_word.exception;

import com.example.hellow_word.dto.StateDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public StateDTO handleException(Exception e){
        //获取传入的code
        int code = ((Errors) e).getCode();
        return StateDTO.error(code , e.getMessage());
    }
}
