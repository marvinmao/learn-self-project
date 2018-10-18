package com.llnqdx.demo.base;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/9/28
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -941162565356620042L;

    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
