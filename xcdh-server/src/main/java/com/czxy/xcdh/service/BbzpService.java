package com.czxy.xcdh.service;

import com.czxy.xcdh.Ryzp;
import com.czxy.xcdh.dao.BbzpMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/5
 */
@Service
@Transactional
public class BbzpService {
    @Resource
    private BbzpMapper bbzpMapper;
    public List<Ryzp> findbbzp(){
        List<Ryzp> ryzps = bbzpMapper.selectAll();
        return ryzps;

    }
}
