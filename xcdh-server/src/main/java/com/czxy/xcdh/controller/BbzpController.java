package com.czxy.xcdh.controller;

import com.czxy.xcdh.Ryzp;
import com.czxy.xcdh.service.BbzpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/5
 */
@RestController
@RequestMapping
public class BbzpController {
    @Resource
    private BbzpService bbzpService;
    @GetMapping("findqz")
    public ResponseEntity<List<Ryzp>> findqz(){
        List<Ryzp> findbbzp = bbzpService.findbbzp();
        return new ResponseEntity<List<Ryzp>>(findbbzp, HttpStatus.OK);


    }
}
