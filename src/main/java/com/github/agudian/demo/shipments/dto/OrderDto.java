package com.github.agudian.demo.shipments.dto;

import java.util.Collection;

import com.github.agudian.demo.base.dto.BaseDto;

/**
 * @author Andreas Gudian
 *
 */
public class OrderDto extends BaseDto {
    private long orderNumber;
    private ContainerDto container;
    private Collection<OrderItemDto> items;

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
}
