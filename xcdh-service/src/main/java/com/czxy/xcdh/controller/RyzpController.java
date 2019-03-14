package com.czxy.xcdh.controller;

import com.czxy.xcdh.Ryzp;
import com.czxy.xcdh.service.RyzpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HOEP
 * @data 2019/2/28
 */
@RestController
@RequestMapping
public class RyzpController {
    @Resource
    private RyzpService ryzpService;

    @PostMapping("addryzp")
    public void addryzp(@RequestBody  Ryzp ryzp){


        ryzpService.AddRyzp(ryzp);
    }
    @PostMapping("/deleteqz")
    public void deleteqz(@RequestBody() Ryzp ryzp){
        System.out.println(ryzp.getRid());


        ryzpService.deleteqz(ryzp.getRid());
    }
}
