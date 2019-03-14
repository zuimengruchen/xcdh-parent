package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOEP
 * @data 2019/3/11
 */
@Table(name = "fyry")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class fyry {
    @Id
    private Integer fyrid;
    private String fyname;
    private String fyzw;
    private Integer fyid;

}
