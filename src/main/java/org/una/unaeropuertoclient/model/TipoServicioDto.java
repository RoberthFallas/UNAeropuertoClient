/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "TipoServicioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class TipoServicioDto {

    private Long id;
    @XmlTransient
    public SimpleStringProperty nombre;
    @XmlTransient
    public SimpleStringProperty descripcion;
    private Boolean avtivo;
    private List<ServicioMantenimientoDto> servicioMantenimientoList;
    public TipoServicioDto(){
     nombre=new SimpleStringProperty();
     descripcion=new SimpleStringProperty();
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

    public String getDescripcion() {
        return descripcion.get();
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public Boolean getAvtivo() {
        return avtivo;
    }

    public void setAvtivo(Boolean avtivo) {
        this.avtivo = avtivo;
    }

    public List<ServicioMantenimientoDto> getServicioMantenimientoList() {
        return servicioMantenimientoList;
    }

    public void setServicioMantenimientoList(List<ServicioMantenimientoDto> servicioMantenimientoList) {
        this.servicioMantenimientoList = servicioMantenimientoList;
    }
    
}
