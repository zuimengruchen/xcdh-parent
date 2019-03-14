package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOEP
 * @data 2019/3/1
 */
@Table(name = "jdls")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jdls {
    @Id
    private Integer lid;
    @Column(name="lname")
    private String lname;
    @Column(name="limgs")
    private String limgs;
    @Column(name="ldetails")
    private String ldetails;
    @Column(name="lct1")
    private String lct1;
    @Column(name="lzt")
    private String lzt;
    @Column(name="lhref")
    private String lhref;
}
