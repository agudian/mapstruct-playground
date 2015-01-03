package com.github.agudian.demo.shipments.dto;

import com.github.agudian.demo.base.dto.BaseDto;
import com.github.agudian.demo.base.dto.Reference;

/**
 * Some meaningful business entity
 */
public class ContainerDto extends BaseDto {
    private Reference destination;

    /**
     * @return the destination
     */
    public Reference getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Reference destination) {
        this.destination = destination;
    }
}
