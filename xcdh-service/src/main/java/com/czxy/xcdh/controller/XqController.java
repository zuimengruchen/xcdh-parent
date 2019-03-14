package com.czxy.xcdh.controller;

import com.czxy.xcdh.Xq;
import com.czxy.xcdh.service.XqService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/4
 */
@RestController
@RequestMapping
public class XqController {
    @Resource
    private XqService xqService;
    @GetMapping("findjdxq")
    public ResponseEntity<List<Xq>> findxq(){
        List<Xq> findxq = xqService.findxq();
        return new ResponseEntity<List<Xq>>(findxq, HttpStatus.OK);


    }
}
