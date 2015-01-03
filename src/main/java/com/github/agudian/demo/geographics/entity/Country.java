package com.github.agudian.demo.geographics.entity;

import com.github.agudian.demo.base.entity.BaseEntity;

/**
 * @author Andreas Gudian
 *
 */
public class Country extends BaseEntity {
    private String code;
    private String name;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
