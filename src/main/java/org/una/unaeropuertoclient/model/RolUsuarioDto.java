/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.una.unaeropuertoclient.utils.DateConverter;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "RolUsuarioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class RolUsuarioDto {

    private Long id;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaModificacion;
    private Boolean activo;
    private RolDto rolesId;

    public RolUsuarioDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;              //Posible error con spring al enviar dato por lo del formato chorizo
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = DateConverter.toLocalDateTime(fechaRegistro);
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;          //Posible error con spring al enviar dato por lo del formato chorizo
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = DateConverter.toLocalDateTime(fechaModificacion);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public RolDto getRolesId() {
        return rolesId;
    }

    public void setRolesId(RolDto rolesId) {
        this.rolesId = rolesId;
    }

}
