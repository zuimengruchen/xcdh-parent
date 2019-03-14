package com.czxy.xcdh.controller;

import com.czxy.xcdh.Jd;
import com.czxy.xcdh.service.JdService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@RestController
@RequestMapping
public class JdController {
    @Resource
    private JdService jdService;

    @GetMapping("/findall")
    public ResponseEntity<List<Jd>> findAllJd(){

        List<Jd> jdList=new ArrayList<>();
        jdList=jdService.findjdall();

        return new ResponseEntity<List<Jd>>(jdList, HttpStatus.OK);


    }
    @PostMapping("/selejd")
    public ResponseEntity<Jd> selejd(@RequestBody  Integer jid){
        Jd selejd = jdService.selejd(jid);
        return new ResponseEntity<Jd>(selejd, HttpStatus.OK);
    }
}
