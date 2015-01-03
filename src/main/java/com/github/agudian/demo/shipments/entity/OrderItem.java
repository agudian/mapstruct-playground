package com.github.agudian.demo.shipments.entity;

import com.github.agudian.demo.base.entity.BaseEntity;

/**
 * @author Andreas Gudian
 *
 */
public class OrderItem extends BaseEntity {
    private String description;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
