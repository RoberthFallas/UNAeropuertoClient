/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
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
@XmlRootElement(name = "GastoReparacionDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class GastoReparacionDto {

    private Long id;

    private LocalDate fechaRegistro;
    private Boolean estadoPago;
    @XmlTransient
    public SimpleLongProperty numeroContrato;
    @XmlTransient
    public SimpleIntegerProperty duracion;
    @XmlTransient
    public SimpleIntegerProperty periodicidad;
    @XmlTransient
    public SimpleStringProperty observaciones;
    private Boolean activo;

    public GastoReparacionDto() {
        numeroContrato = new SimpleLongProperty();
        duracion = new SimpleIntegerProperty();
        periodicidad = new SimpleIntegerProperty();
        observaciones = new SimpleStringProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaRegistro() {
        return DateConverter.toSpringDate(fechaRegistro);
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = DateConverter.toLocalDate(fechaRegistro);
    }

    public Boolean getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Long getNumeroContrato() {
        return numeroContrato.get();
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato.set(numeroContrato);
    }

    public Integer getDuracion() {
        return duracion.get();
    }

    public void setDuracion(Integer duracion) {
        this.duracion.set(duracion);
    }

    public Integer getPeriodicidad() {
        return periodicidad.get();
    }

    public void setPeriodicidad(Integer periodicidad) {
        this.periodicidad.set(periodicidad);
    }

    public String getObservaciones() {
        return observaciones.get();
    }

    public void setObservaciones(String observaciones) {
        this.observaciones.set(observaciones);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
