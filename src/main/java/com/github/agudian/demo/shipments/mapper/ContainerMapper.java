package com.github.agudian.demo.shipments.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.github.agudian.demo.base.mapper.GeneralEntityDtoMappingConfiguration;
import com.github.agudian.demo.shipments.dto.ContainerDto;
import com.github.agudian.demo.shipments.entity.Container;

/**
 * Mapper for Container entity
 */
@Mapper( config = GeneralEntityDtoMappingConfiguration.class )
public interface ContainerMapper {
    Container toContainer(ContainerDto dto);

    Container intoContainer(ContainerDto dto, @MappingTarget Container entity);

    ContainerDto toContainerDto(Container entity);
}
