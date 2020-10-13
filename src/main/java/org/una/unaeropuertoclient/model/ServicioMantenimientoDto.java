/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javafx.beans.property.SimpleLongProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.una.unaeropuertoclient.utils.DateConverter;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "ServicioMantenimientoDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ServicioMantenimientoDto {

    private Long id;
    private LocalDate fechaServicio;
    @XmlTransient
    public SimpleLongProperty numeroFactura;
    private Boolean estadoPago;
    private Boolean estaFinalizacion;
    private Boolean activo;
    private AvionDto avionesId;

    private TipoServicioDto tiposServiciosId;
    private List<CobroDto> cobroList;

    public ServicioMantenimientoDto() {
        numeroFactura = new SimpleLongProperty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaServicio() {
        Date date = Date.from(fechaServicio.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaServicio(LocalDate fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public Long getNumeroFactura() {
        return numeroFactura.get();
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura.set(numeroFactura);
    }

    public Boolean getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Boolean getEstaFinalizacion() {
        return estaFinalizacion;
    }

    public void setEstaFinalizacion(Boolean estaFinalizacion) {
        this.estaFinalizacion = estaFinalizacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public AvionDto getAvionesId() {
        return avionesId;
    }

    public void setAvionesId(AvionDto avionesId) {
        this.avionesId = avionesId;
    }

    public List<CobroDto> getCobroList() {
        return cobroList;
    }

    public void setCobroList(List<CobroDto> cobroList) {
        this.cobroList = cobroList;
    }

    public TipoServicioDto getTiposServiciosId() {
        return tiposServiciosId;
    }

    public void setTiposServiciosId(TipoServicioDto tiposServiciosId) {
        this.tiposServiciosId = tiposServiciosId;
    }

}
