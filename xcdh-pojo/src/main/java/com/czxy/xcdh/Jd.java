package com.czxy.xcdh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * @author HOEP
 * @data 2019/2/27
 */

@Table(name = "Jd")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jd {
    @Id
    private Integer jid;
    private String jname;
    private String jimgs;
    private String jdetails;
    private String jintroduction;
    private String jtitle;
    private String jhref;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Jd jd = (Jd) o;
        return jid.equals(jd.jid) &&
                Objects.equals(jname, jd.jname) &&
                Objects.equals(jimgs, jd.jimgs) &&
                Objects.equals(jdetails, jd.jdetails) &&
                Objects.equals(jintroduction, jd.jintroduction) &&
                Objects.equals(jtitle, jd.jtitle) &&
                Objects.equals(jhref, jd.jhref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jid, jname, jimgs, jdetails, jintroduction, jtitle, jhref);
    }

}
