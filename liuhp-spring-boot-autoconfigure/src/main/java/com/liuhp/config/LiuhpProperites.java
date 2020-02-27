package com.liuhp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: liuhp534
 * @create: 2020-02-27 15:31
 */
@ConfigurationProperties(prefix = "liuhp")
public class LiuhpProperites {

    private String msg;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
