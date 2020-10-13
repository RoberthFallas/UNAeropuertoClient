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
@XmlRootElement(name = "AlertaDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AlertaDto {

    private Long id;
    private Byte tipo;
    @XmlTransient
    public SimpleStringProperty titulo;
    @XmlTransient
    public SimpleStringProperty cuerpo;
    private Boolean activa;
//    private List<VueloDto> vueloList;

    public AlertaDto() {

        titulo = new SimpleStringProperty();
        cuerpo = new SimpleStringProperty();
        id = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getTipo() {
        return tipo;
    }

    public void setTipo(Byte tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo.get();
    }

    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public String getCuerpo() {
        return cuerpo.get();
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo.set(cuerpo);
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}
