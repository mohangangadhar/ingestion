package com.ast.ingestion.mapper;

import com.ast.ingestion.dto.AbstractDTO;
import org.apache.batik.dom.AbstractEntity;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.InvocationTargetException;

@Component
public class ReferenceMapper {

    private final EntityManager em;
    Logger logger = LoggerFactory.getLogger(ReferenceMapper.class);

    public ReferenceMapper(EntityManager em) {
        this.em = em;
    }

    @ObjectFactory
    public <T extends AbstractEntity> T resolve(AbstractDTO<?> sourceDTO,
                                                   @TargetType Class<T> type) {
        T entity = null;
        if (sourceDTO.getId() != null) entity = em.find(type, sourceDTO.getId());
        try {
            if (entity == null) {
                entity = type.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            logger.error(e.getMessage());
        }
        return entity;
    }
}