package com.github.agudian.demo.base.mapper;

import org.mapstruct.BeforeMapping;
import org.mapstruct.TargetType;

import com.github.agudian.demo.base.dto.Reference;
import com.github.agudian.demo.base.entity.BaseEntity;

/**
 * Basic mapper that provides methods used in all the generated mappers
 */
public class BaseMapper {
    public <T extends BaseEntity> T toEntity(Reference ref, @TargetType Class<T> entityClass) {
        if ( null == ref ) {
            return null;
        }

        return findByPk( ref.getId(), entityClass );
    }

    @BeforeMapping
    public void flushIfNecessary(BaseEntity entity) {
        // EntityManager.flush, if the something was changed within this component to make sure the #version is
        // correctly propagated
    }

    private <T> T findByPk(Object pk, Class<T> clazz) {
        // this would be called on the entity manager
        return null;
    }
}
