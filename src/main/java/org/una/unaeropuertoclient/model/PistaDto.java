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
@XmlRootElement(name = "PistaDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class PistaDto {

    private Long id;
    @XmlTransient
    public SimpleStringProperty numeroPista;
    @XmlTransient
    public SimpleFloatProperty longitud;
    private Boolean activo;
//    @Setter(AccessLevel.NONE)
//    private List<VueloDto> vueloList

    public PistaDto() {
        numeroPista = new SimpleStringProperty();
        longitud = new SimpleFloatProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPista() {
        return numeroPista.get();
    }

    public void setNumeroPista(String numeroPista) {
        this.numeroPista.set(numeroPista);
    }

    public Float getLongitud() {
        return longitud.get();
    }

    public void setLongitud(Float longitud) {
        this.longitud.set(longitud);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
