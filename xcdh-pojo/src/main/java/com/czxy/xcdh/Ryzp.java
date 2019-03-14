package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@Table(name = "ryzp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ryzp {
    @Id
    private String  rid;
    private String rname;
    private String rphone;
    private String rdetails;
    private String rexperience;
    private String rjob;
    private String rzt;

}
