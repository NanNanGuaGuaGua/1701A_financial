package com.bawei.manager.myconfig;

import com.bawei.manager.enums.ErrorEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//统一错误处理
@ControllerAdvice(basePackages = {"com.bawei.manager.controller"})
public class ErrorControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity handleException(Exception e){
        String message = e.getMessage();
        Map map = new HashMap();
        ErrorEnum byCode = ErrorEnum.getByCode(message);

        map.put("message",byCode.getMessage());
        map.put("code",byCode.getCode());
        map.put("canRetry",byCode.isCanRetry());
        map.put("type","active");
        return new ResponseEntity(map, HttpStatus.INSUFFICIENT_STORAGE);

    }
}
