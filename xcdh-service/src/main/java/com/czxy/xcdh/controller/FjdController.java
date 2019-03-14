package com.czxy.xcdh.controller;

import com.czxy.xcdh.fjd;
import com.czxy.xcdh.service.FjdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/11
 */
@RestController
@RequestMapping
public class FjdController {

    @Resource
    private FjdService fjdService;
    @GetMapping("/findfjd")
    public List<fjd> findfjd(){
        List<fjd> f = fjdService.findF();
        return f;
    }



}

