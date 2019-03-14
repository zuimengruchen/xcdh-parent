package com.czxy.xcdh.controller;

import com.czxy.xcdh.Yxjd;
import com.czxy.xcdh.service.YxjdService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/8
 */
@RestController
@RequestMapping
public class YxjdController {
    @Resource
    private YxjdService yxjdService;
    @GetMapping("/findyxjd")
    public ResponseEntity<List<Yxjd>> findyxjd(){
        List<Yxjd> findyxjd = yxjdService.findyxjd();
        return new ResponseEntity<List<Yxjd>>(findyxjd, HttpStatus.OK);
    }
}
