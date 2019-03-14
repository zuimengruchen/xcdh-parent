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
@Table(name = "fzj")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class fzj {
    @Id
    private Integer fzjid;
    private String fzname;
    private String fzdj;
    private Integer fyid;
    private Integer fzid;
    private List<fyry> fyryList;
}
