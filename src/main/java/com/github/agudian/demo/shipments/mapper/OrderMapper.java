package com.github.agudian.demo.shipments.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.github.agudian.demo.base.mapper.GeneralEntityDtoMappingConfiguration;
import com.github.agudian.demo.shipments.dto.OrderDto;
import com.github.agudian.demo.shipments.dto.OrderItemDto;
import com.github.agudian.demo.shipments.entity.Order;
import com.github.agudian.demo.shipments.entity.OrderItem;

/**
 * Mapper for Order entity
 */
@Mapper( 
    config = GeneralEntityDtoMappingConfiguration.class,
    uses = ContainerMapper.class
)
public interface OrderMapper {
    Order toOrder(OrderDto dto);

    Order intoOrder(OrderDto dto, @MappingTarget Order entity);

    OrderDto toOrderDto(Order entity);

    OrderItem toOrderItem(OrderItemDto dto);

    OrderItem intoOrderItem(OrderItemDto dto, @MappingTarget OrderItem entity);

    OrderItemDto toOrderItemDto(OrderItem entity);
}
