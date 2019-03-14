package com.czxy.xcdh.zuul;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by HP on 2018/12/17.
 */
@ConfigurationProperties(prefix = "sc.filter")
public class FilterProperties {

    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }

}
