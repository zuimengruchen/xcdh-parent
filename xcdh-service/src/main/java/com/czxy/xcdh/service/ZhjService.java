package com.czxy.xcdh.service;

import com.czxy.xcdh.Zhj;
import com.czxy.xcdh.Zhjzl;
import com.czxy.xcdh.dao.ZhjMapper;
import com.czxy.xcdh.dao.ZhjzlMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/2/28
 */
@Service
@Transactional
public class ZhjService {
    @Resource
    private ZhjMapper zhjMapper;
    @Resource
    private ZhjzlMapper zhjzlMapper;
    public List<Zhj> findzhj(){
        List<Zhj> zhjs = zhjMapper.selectAll();
        return zhjs;

    }
    public List<Zhjzl> findZhjzl(){

        List<Zhjzl> zhjzls = zhjzlMapper.selectAll();
        return zhjzls;

    }
    public Zhj findzlxq(Integer zid){
//        System.out.println("zid为" + zid);
        Zhj zhj = zhjMapper.selectByPrimaryKey(zid);
//        System.out.println(zhj);
        return zhj;
    }
    public void editzl(Zhj zhj){
        zhjMapper.updateByPrimaryKeySelective(zhj);
    }
    public void addzl(Zhj zhj){
        zhjMapper.insert(zhj);
    }
    public void delezl(Integer zid){
        zhjMapper.deleteByPrimaryKey(zid);
    }
}
