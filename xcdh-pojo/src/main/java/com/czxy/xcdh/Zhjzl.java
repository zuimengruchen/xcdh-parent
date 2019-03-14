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
@Table(name = "zhjzl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Zhjzl {
    @Id
    private Integer id;
    private String logo;
}
