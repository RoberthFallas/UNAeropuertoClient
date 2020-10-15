/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDateTime;
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
@XmlRootElement(name = "VueloDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class VueloDto {

    private Long id;
    @XmlTransient
    public SimpleStringProperty nombreVuelo;
    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;
    private Byte estado;
    private AvionDto avionesId;
    private PistaDto pistasId;
    private LugarDto lugarSalida;
    private LugarDto lugarLlegada;
    private AlertaDto alerta;

    public VueloDto() {
        nombreVuelo = new SimpleStringProperty();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreVuelo() {
        return nombreVuelo.get();
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo.set(nombreVuelo);
    }

    public String getHoraSalida() {
        return DateConverter.toSpringDateTime(horaSalida);
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = DateConverter.toLocalDateTime(horaSalida);
    }

    public String getHoraLlegada() {
        return DateConverter.toSpringDateTime(horaLlegada);
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = DateConverter.toLocalDateTime(horaLlegada);
    }

    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    public AvionDto getAvionesId() {
        return avionesId;
    }

    public void setAvionesId(AvionDto avionesId) {
        this.avionesId = avionesId;
    }

    public PistaDto getPistasId() {
        return pistasId;
    }

    public void setPistasId(PistaDto pistasId) {
        this.pistasId = pistasId;
    }

    public LugarDto getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(LugarDto lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public LugarDto getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(LugarDto lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public AlertaDto getAlerta() {
        return alerta;
    }

    public void setAlerta(AlertaDto alerta) {
        this.alerta = alerta;
    }

}
