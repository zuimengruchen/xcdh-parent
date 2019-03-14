package com.czxy.xcdh.service;

import com.czxy.xcdh.Jdls;
import com.czxy.xcdh.dao.JdlsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/1
 */
@Service
@Transactional
public class JdlsService {
    @Resource
    private JdlsMapper jdlsMapper;
    public List<Jdls> findjdls(){

        List<Jdls> jdls = jdlsMapper.selectAll();
        return jdls;
    }
    public Jdls findjsls(Integer lid){
        Jdls jdls = jdlsMapper.selectByPrimaryKey(lid);
        return jdls;
    }
    public void  editls(Jdls jdls){
        jdlsMapper.updateByPrimaryKeySelective(jdls);
    }
    public void  delels(Integer lid){
        jdlsMapper.deleteByPrimaryKey(lid);
    }
    public void addls(Jdls jdls){
        jdlsMapper.insert(jdls);
    }
}
