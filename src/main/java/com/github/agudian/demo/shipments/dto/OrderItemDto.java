package com.github.agudian.demo.shipments.dto;

import com.github.agudian.demo.base.dto.BaseDto;

/**
 * Some meaningful business entity
 */
public class OrderItemDto extends BaseDto {
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
