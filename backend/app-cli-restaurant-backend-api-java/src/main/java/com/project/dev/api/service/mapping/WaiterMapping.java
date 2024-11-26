/*
 * @fileoverview    {WaiterMapping}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.service.mapping;

import com.project.dev.api.domain.Waiter;
import com.project.dev.api.dto.WaiterDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Description of {@code WaiterMapping}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WaiterMapping extends GenericMapping<WaiterDTO, Waiter> {

    /**
     * Obtiene una entidad en base a su DTO usando el campo clave de la base de datos.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    @Mapping(source = "intWaiterId", target = "intWaiterId")
    @Override
    public Waiter getEntity(WaiterDTO dto);

    /**
     * Obtiene un DTO en base a su entidad usando el campo clave de la base de datos.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    @Mapping(source = "intWaiterId", target = "intWaiterId")
    @Override
    public WaiterDTO getDto(Waiter entity);

    /**
     * TODO: Description of {@code withId}.
     *
     * @param strId
     * @return
     */
    public default Waiter withId(String strId) {
        if (strId == null) {
            return null;
        }
        Waiter entity = new Waiter();
        entity.setIntWaiterId(Long.parseLong(strId));
        return entity;
    }
}