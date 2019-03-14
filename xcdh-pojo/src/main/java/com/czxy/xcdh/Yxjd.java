package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

/**
 * @author HOEP
 * @data 2019/3/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Yxjd {
    @Id
    private Integer yid;
    private String yname;
    private String yimgs;
    private String ydetails;
    private String yct;

}
