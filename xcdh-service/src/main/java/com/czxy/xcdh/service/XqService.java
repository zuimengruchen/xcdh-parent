package com.czxy.xcdh.service;

import com.czxy.xcdh.Xq;
import com.czxy.xcdh.dao.XqMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/4
 */
@Service
@Transactional
public class XqService {
    @Resource
    private XqMapper xqMapper;
    public List<Xq> findxq(){
        List<Xq> xqs = xqMapper.selectAll();
        return xqs;

    }
}
