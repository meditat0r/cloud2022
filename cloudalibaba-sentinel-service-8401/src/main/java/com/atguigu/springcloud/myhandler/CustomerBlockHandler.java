package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @Author meditat0r
 * @create 2022/1/25 14:52
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception){
        return new CommonResult(0, "按客户自定义,global handlerException 1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(0, "按客户自定义,global handlerException 2");
    }
}
