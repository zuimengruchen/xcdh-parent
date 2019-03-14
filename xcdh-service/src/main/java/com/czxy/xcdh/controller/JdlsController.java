package com.czxy.xcdh.controller;

import com.czxy.xcdh.Jdls;
import com.czxy.xcdh.service.JdlsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/1
 */
@RestController
@RequestMapping
public class JdlsController {
    @Resource
    private JdlsService jdlsService;
    @GetMapping("/findjdls")
    public ResponseEntity<List<Jdls>> findjdls(){
        List<Jdls> findjdls = jdlsService.findjdls();
        return new ResponseEntity<List<Jdls>>(findjdls, HttpStatus.OK);


    }
    @PostMapping("/findlsxq")
    public ResponseEntity<Jdls> findlsxq(@RequestBody  Integer lid){
        Jdls findjsls = jdlsService.findjsls(lid);
        return new ResponseEntity<Jdls>(findjsls, HttpStatus.OK);
    }
    @PostMapping("/editls")
    public void editls(@RequestBody Jdls jdls){
        System.out.println(jdls);
        jdlsService.editls(jdls);

    }
    @PostMapping("/delels")
    public void delels(@RequestBody Jdls jdls){
        System.out.println(jdls.getLid());
        jdlsService.delels(jdls.getLid());
    }
    @PostMapping("/addls")
    public void addls(@RequestBody Jdls jdls){
        System.out.println(jdls);
        jdlsService.addls(jdls);
    }
}
