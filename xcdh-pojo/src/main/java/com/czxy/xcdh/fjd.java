package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @author HOEP
 * @data 2019/3/11
 */
    @Table(name = "fjd")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
public class fjd {
        @Id
    private Integer fjid;
        private String  fjname;
        private Integer fzid;
        private List<fzj> fzjList;
}
