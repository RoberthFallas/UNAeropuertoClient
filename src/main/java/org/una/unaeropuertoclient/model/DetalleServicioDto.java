/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import javafx.beans.property.SimpleFloatProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "DetalleServicioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DetalleServicioDto {

    private Long id;
    @XmlTransient
    public SimpleFloatProperty monto;

    private Boolean activo;
//    @Setter(AccessLevel.NONE)
//    private TipoReparacionDto tiposId;
//    @Setter(AccessLevel.NONE)
//    private ProvedorDto provedoresId;
//    @Setter(AccessLevel.NONE)
//    private GastoReparacionDto gastosReparacionesId;

    public DetalleServicioDto() {
        monto = new SimpleFloatProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMonto() {
        return monto.get();
    }

    public void setMonto(Float monto) {
        this.monto.set(monto);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
