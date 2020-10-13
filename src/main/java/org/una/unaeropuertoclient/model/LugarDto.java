/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "LugarDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class LugarDto {

    private Long id;
    @XmlTransient
    private SimpleStringProperty nombre;
    private Boolean activo;
//    @Setter(AccessLevel.NONE)
//    private List<VueloDto> vuelosSalidaList;
//    @Setter(AccessLevel.NONE)
//    private List<VueloDto> vuelosLlegadaList;

    public LugarDto() {
        nombre = new SimpleStringProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
