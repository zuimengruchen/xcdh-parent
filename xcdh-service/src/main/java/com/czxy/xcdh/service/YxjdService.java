package com.czxy.xcdh.service;

import com.czxy.xcdh.Yxjd;
import com.czxy.xcdh.dao.YxjdMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/8
 */
@Service
@Transactional
public class YxjdService {
    @Resource
    private YxjdMapper yxjdMapper;
    public List<Yxjd> findyxjd(){
        List<Yxjd> yxjds = yxjdMapper.selectAll();
        return yxjds;
    }
}
