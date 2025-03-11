package org.sang.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sang on 2017/12/17.
 */
@Getter
@Setter
public class RespBean {
    private String status;
    private String msg;

    public RespBean() {
    }

    public RespBean(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }
}
