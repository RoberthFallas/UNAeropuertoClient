/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
    private LocalDate horaSalida;
    private LocalDate horaLlegada;
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
        Date date = Date.from(horaSalida.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        Date date = Date.from(horaLlegada.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setHoraLlegada(LocalDate horaLlegada) {
        this.horaLlegada = horaLlegada;
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
