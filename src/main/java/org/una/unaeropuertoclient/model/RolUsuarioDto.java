/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javafx.beans.property.SimpleObjectProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.una.unaeropuertoclient.utils.DateConverter;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "RolUsuarioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class RolUsuarioDto {

    private Long id;
    @XmlTransient
    public SimpleObjectProperty<LocalDate> fechaRegistro;
    @XmlTransient
    public SimpleObjectProperty<LocalDate> fechaModificacion;
    private Boolean activo;
    private RolDto rolesId;

    public RolUsuarioDto() {
        fechaModificacion = new SimpleObjectProperty();
        fechaModificacion.set(LocalDate.now());
        fechaRegistro = new SimpleObjectProperty();
        fechaRegistro.set(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        Date date = Date.from(fechaRegistro.get().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return date;

    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro.set(fechaRegistro.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }

    public Date getFechaModificacion() {
        Date date = Date.from(fechaRegistro.get().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return date;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion.set(fechaModificacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
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
