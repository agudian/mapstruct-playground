package com.github.agudian.demo.shipments.entity;

import com.github.agudian.demo.base.entity.BaseEntity;
import com.github.agudian.demo.geographics.entity.IATALocation;

/**
 * Some meaningful business entity
 */
public class Container extends BaseEntity {
    private IATALocation destination;

    /**
     * @return the destination
     */
    public IATALocation getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(IATALocation destination) {
        this.destination = destination;
    }
}
