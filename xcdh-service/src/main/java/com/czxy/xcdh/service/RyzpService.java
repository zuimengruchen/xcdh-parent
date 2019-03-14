package com.czxy.xcdh.service;

import com.czxy.xcdh.Ryzp;
import com.czxy.xcdh.dao.RyzpMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;
import java.util.UUID;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@Service
@Transactional
public class RyzpService {
    @Resource
    private RyzpMapper ryzpMapper;

    public void AddRyzp(Ryzp ryzp){


        String uuid = String.valueOf(UUID.randomUUID());
          ryzp.setRid(uuid);
         ryzp.setRzt("0");
     ryzpMapper.insert(ryzp);

    }
     public List<Ryzp> findallryzp(){
         List<Ryzp> ryzps = ryzpMapper.selectAll();
         return ryzps;
     }
     public void deleteqz(String  rid){
         System.out.println(rid);
         ryzpMapper.deleteByPrimaryKey(rid);

     }


}
