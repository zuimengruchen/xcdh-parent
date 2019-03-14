package com.czxy.xcdh.service;

import com.czxy.xcdh.Jd;
import com.czxy.xcdh.dao.JdMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@Service
@Transactional
public class JdService {
    @Resource
    private JdMapper jdMapper;

    public List<Jd> findjdall(){
        List<Jd> jd=new ArrayList<>();

        jd=jdMapper.selectAll();

        return jd;
    }
    public Jd selejd(Integer jid){
        Jd jd = jdMapper.selectByPrimaryKey(jid);
        return jd;
    }
}
