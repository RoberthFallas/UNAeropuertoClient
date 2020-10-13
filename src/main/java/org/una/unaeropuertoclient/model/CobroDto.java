/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "CobroDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CobroDto {
    
    private Long id;
    @XmlTransient
    public SimpleFloatProperty monto;
    @XmlTransient
    public SimpleStringProperty detalleCobro;
    private Boolean activo;

    //  @Setter(AccessLevel.NONE)
    // private ServicioMantenimientoDto serviciosMantenimientoId;
    public CobroDto() {
        monto = new SimpleFloatProperty();
        detalleCobro = new SimpleStringProperty();
        id = 0L;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setMonto(Float monto) {
        this.monto.set(monto);
    }
    
    public void setDetalleCobro(String detalleCobro) {
        this.detalleCobro.set(detalleCobro);
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    public Long getId() {
        return id;
    }
    
    public Float getMonto() {
        return monto.get();
    }
    
    public String getDetalleCobro() {
        return detalleCobro.get();
    }
    
    public Boolean getActivo() {
        return activo;
    }
}
