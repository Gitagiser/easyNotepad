package com.gsj.springbootmp.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static Result<Map<String, Object>> success() {
        return new Result<>(20000,"success",null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(20000,"success",data);
    }

//    public static <T> Result<T> success(T data, String message) {
//        return new Result<>(20000,"success",message,data);
//    }
}
