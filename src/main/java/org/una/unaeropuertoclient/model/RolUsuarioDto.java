/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
    private LocalDate fechaRegistro;
    private LocalDate fechaModificacion;
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

    public String getFechaRegistro() {
        Date date = Date.from(fechaModificacion.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaModificacion() {
        Date date = Date.from(fechaModificacion.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
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
