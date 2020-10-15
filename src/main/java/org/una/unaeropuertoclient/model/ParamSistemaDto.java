/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDateTime;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.una.unaeropuertoclient.utils.DateConverter;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "ParamSistemaDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ParamSistemaDto {

    private Long id;
    private Short vuelosHora;
    @XmlTransient
    private SimpleIntegerProperty tiempoInactividad;
    @XmlTransient
    public SimpleStringProperty telefonoAeropuerto;
    @XmlTransient
    public SimpleStringProperty emailAeropuerto;
    @XmlTransient
    public SimpleStringProperty nombreRepresentante;
    @XmlTransient
    public SimpleObjectProperty<LocalDateTime> aperturaOficina;
    @XmlTransient
    public SimpleObjectProperty<LocalDateTime> cierreOficina;

    public ParamSistemaDto() {
        telefonoAeropuerto = new SimpleStringProperty();
        emailAeropuerto = new SimpleStringProperty();
        nombreRepresentante = new SimpleStringProperty();
        cierreOficina = new SimpleObjectProperty<>();
        aperturaOficina = new SimpleObjectProperty<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getVuelosHora() {
        return vuelosHora;
    }

    public void setVuelosHora(Short vuelosHora) {
        this.vuelosHora = vuelosHora;
    }

    public Integer getTiempoInactividad() {
        return tiempoInactividad.get();
    }

    public void setTiempoInactividad(Integer tiempoInactividad) {
        this.tiempoInactividad.set(tiempoInactividad);
    }

    public String getTelefonoAeropuerto() {
        return telefonoAeropuerto.get();
    }

    public void setTelefonoAeropuerto(String telefonoAeropuerto) {
        this.telefonoAeropuerto.set(telefonoAeropuerto);
    }

    public String getEmailAeropuerto() {
        return emailAeropuerto.get();
    }

    public void setEmailAeropuerto(String emailAeropuerto) {
        this.emailAeropuerto.set(emailAeropuerto);
    }

    public String getNombreRepresentante() {
        return nombreRepresentante.get();
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante.set(nombreRepresentante);
    }

    public String getAperturaOficina() {
        return DateConverter.toSpringDateTime(aperturaOficina.get());
    }

    public void setAperturaOficina(String aperturaOficina) {
        this.aperturaOficina.set(DateConverter.toLocalDateTime(aperturaOficina));
    }

    public String getCierreOficina() {
        return DateConverter.toSpringDateTime(cierreOficina.get());
    }

    public void setCierreOficina(String cierreOficina) {
        this.cierreOficina.set(DateConverter.toLocalDateTime(cierreOficina));
    }

}
