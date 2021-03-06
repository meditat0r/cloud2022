package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author meditat0r
 * @create 2021/12/31 9:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    /** success:0;failure:1 */
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
