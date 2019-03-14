package com.czxy.xcdh.service;

import com.czxy.xcdh.dao.FjdMapper;
import com.czxy.xcdh.dao.FyryMapper;
import com.czxy.xcdh.dao.FzjMapper;
import com.czxy.xcdh.fjd;
import com.czxy.xcdh.fyry;
import com.czxy.xcdh.fzj;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/11
 */
@Service
public class FjdService {

    @Resource
    private FjdMapper fjdMapper;
    @Resource
    private FzjMapper fzjMapper;
@Resource
private FyryMapper fyryMapper;
    public List<fjd> findF (){
        List<fjd> fjds = fjdMapper.selectAll();
        Example example =new Example(fzj.class);
        Example.Criteria criteria = example.createCriteria();

        for (fjd fjd :fjds ){
                criteria.andEqualTo("fzid",fjd.getFzid());
            List<fzj> fzjs = fzjMapper.selectByExample(example);
            fjd.setFzjList(fzjs);
            System.out.println(fzjs);
            Example example1 =new Example(fyry.class);
            Example.Criteria criteria1 = example1.createCriteria();

            for (fzj fzj :fzjs ){
                criteria.andEqualTo("fyid",fzj.getFyid());
                List<fyry> fyrys = fyryMapper.selectByExample(example1);
                fzj.setFyryList(fyrys);
                System.out.println(fyrys);

            }
        }

        System.out.println(fjds);
        return fjds;
    }

}
