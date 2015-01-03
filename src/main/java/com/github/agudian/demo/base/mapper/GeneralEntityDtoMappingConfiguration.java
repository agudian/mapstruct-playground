package com.github.agudian.demo.base.mapper;

import org.mapstruct.GlobalMapping;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.github.agudian.demo.base.dto.BaseDto;
import com.github.agudian.demo.base.entity.BaseAuditedEntity;
import com.github.agudian.demo.base.entity.BaseEntity;

/**
 * General configuration for all specific mappers that map between Entities and Dtos
 */
@MapperConfig(
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    componentModel = "spring",
    uses = { BaseMapper.class },

    globalMappings = {
        // When mapping from an entity to the DTO, the uuid is known to be un-mappable.
        @GlobalMapping(
            sourceType = BaseEntity.class,
            targetType = BaseDto.class,
            mappings = {
                @Mapping( target = "uuid", ignore = true )
            }
        ),

        // When mapping from DTO to an autited entity, the lastUpdate* properties are not mapped (and in most DTOs not
        // present anyway)
        @GlobalMapping( 
            sourceType = BaseDto.class, 
            targetType = BaseAuditedEntity.class, 
            mappings = {
                @Mapping( target = "lastUpdateUser", ignore = true ),
                @Mapping( target = "lastUpdateTime", ignore = true ) 
            }
        )
    }
)
public final class GeneralEntityDtoMappingConfiguration {

}
