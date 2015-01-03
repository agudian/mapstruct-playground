package com.github.agudian.demo.base.dto;

import java.io.Serializable;

/**
 * Hold the primary key for some related entity
 */
public class Reference implements Serializable {
    private Long id;

    public Reference(Long id) {
        this.id = id;
    }

    public Reference() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
