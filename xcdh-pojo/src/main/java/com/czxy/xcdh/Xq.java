package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOEP
 * @data 2019/3/4
 */
@Table(name = "Xq")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Xq {
    @Id
    private Integer xid;
    private String  xname;
    private String  ximgs;
    private String  xdetails;
    private String  xct1;
    private String ximg;
    private String xzt;
}
