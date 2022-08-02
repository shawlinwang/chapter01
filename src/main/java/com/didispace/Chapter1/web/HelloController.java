package com.didispace.Chapter1.web;

import com.didispace.Chapter1.exceptions.MyException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "获取用户列表", notes = "测试")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }

    @ApiOperation(value = "获取用户列表", notes = "测试")
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String json() throws MyException {
        throw new MyException("发生错误");
    }
}
