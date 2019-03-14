package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOEP
 * @data 2019/2/28
 */
@Table(name = "zhj")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Zhj {
    @Id
    private Integer zid;
    private String zname;
    private String zdetails;
    private String zct1;
    private String zct2;
    private String zct3;
    private String zimags;
    private String zimags2;
    private String zhefr;
}
