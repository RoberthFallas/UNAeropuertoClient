/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "AerolineaDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AerolineaDto implements Serializable {

    private Long id;
    @XmlTransient
    public SimpleStringProperty nombre;
    private Boolean actiov;
//    @Setter(AccessLevel.NONE)
    //  private List<AvionDto> avionList;

    public AerolineaDto() {
        nombre = new SimpleStringProperty();
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre.get();
    }

    public Boolean getActiov() {
        return actiov;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public void setActiov(Boolean actiov) {
        this.actiov = actiov;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
