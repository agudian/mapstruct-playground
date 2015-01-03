package com.github.agudian.demo.shipments.entity;

import java.util.Collection;

import com.github.agudian.demo.base.entity.BaseAuditedEntity;

/**
 * Some meaningful business entity
 */
public class Order extends BaseAuditedEntity {
    private long orderNumber;

    private Collection<OrderItem> items;

    private Container container;

    /**
     * @return the orderNumber
     */
    public long getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return the items
     */
    public Collection<OrderItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Collection<OrderItem> items) {
        this.items = items;
    }

    /**
     * @return the container
     */
    public Container getContainer() {
        return container;
    }

    /**
     * @param container the container to set
     */
    public void setContainer(Container container) {
        this.container = container;
    }
}
