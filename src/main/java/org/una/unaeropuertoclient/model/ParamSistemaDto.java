/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javafx.beans.property.SimpleIntegerProperty;
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
    private LocalDate vuelosHora;
    @XmlTransient
    private SimpleIntegerProperty tiempoInactividad;
    @XmlTransient
    public SimpleStringProperty telefonoAeropuerto;
    @XmlTransient
    public SimpleStringProperty emailAeropuerto;
    @XmlTransient
    public SimpleStringProperty nombreRepresentante;
    private LocalDate aperturaOficina;
    private LocalDate cierreOficina;

    public ParamSistemaDto() {
        telefonoAeropuerto = new SimpleStringProperty();
        emailAeropuerto = new SimpleStringProperty();
        nombreRepresentante = new SimpleStringProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVuelosHora() {
        Date date = Date.from(vuelosHora.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setVuelosHora(LocalDate vuelosHora) {
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
        Date date = Date.from(aperturaOficina.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setAperturaOficina(LocalDate aperturaOficina) {
        this.aperturaOficina = aperturaOficina;
    }

    public String getCierreOficina() {
        Date date = Date.from(cierreOficina.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setCierreOficina(LocalDate cierreOficina) {
        this.cierreOficina = cierreOficina;
    }

}
