package com.czxy.xcdh.controller;

import com.czxy.xcdh.Zhj;
import com.czxy.xcdh.Zhjzl;
import com.czxy.xcdh.service.ZhjService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/2/28
 */
@RestController
@RequestMapping
public class ZhjController {
    @Resource
    private ZhjService zhjService;
    @GetMapping("findzhj")
    public ResponseEntity<List<Zhj>> findzhj(){
        List<Zhj> findzhj = zhjService.findzhj();

        return new ResponseEntity<List<Zhj>>(findzhj, HttpStatus.OK);
    }
    @GetMapping("findzhjzl")
    public ResponseEntity<List<Zhjzl>> findzhjzl(){
        List<Zhjzl> zhjzl = zhjService.findZhjzl();
        return new ResponseEntity<List<Zhjzl>>(zhjzl, HttpStatus.OK);

    }
    @PostMapping("/findzlxq")
    public ResponseEntity<Zhj> findzlxq(@RequestBody  Integer zid){
//        Integer zid =232;
//        System.out.println("zid为" + zid);
        Zhj findzlxq = zhjService.findzlxq(zid);
//        System.out.println(findzlxq);
        return new ResponseEntity<Zhj>(findzlxq, HttpStatus.OK);
    }
    @PostMapping("/editzl")
    public void editzl(@RequestBody Zhj zhj){
        System.out.println("战略："+zhj);
        zhjService.editzl(zhj);
    }
    @PostMapping("/addzl")
    public void addzl(@RequestBody Zhj zhj){
        System.out.println(zhj);
        zhjService.addzl(zhj);
    }
    @PostMapping("/delezl")
    public void delezl(@RequestBody Integer zid){
        System.out.println(zid);
        zhjService.delezl(zid);
    }
}
