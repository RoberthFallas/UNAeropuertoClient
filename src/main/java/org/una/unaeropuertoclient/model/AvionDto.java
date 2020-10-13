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
@XmlRootElement(name = "AvionDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AvionDto {

    private Long id;
    @XmlTransient
    public SimpleStringProperty matricula;
    private Boolean activo;
//    @Setter(AccessLevel.NONE)
//    private List<ServicioMantenimientoDto> servicioMantenimientoList;
//    @Setter(AccessLevel.NONE)
    private AerolineaDto aerolineasId;
//    @Setter(AccessLevel.NONE)
//    private List<VueloDto> vueloList;

    public AvionDto() {
        matricula = new SimpleStringProperty();
        id = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula.get();
    }

    public void setMatricula(String matricula) {
        this.matricula.set(matricula);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public AerolineaDto getAerolineaDto() {
        return aerolineasId;
    }

    public void setAerolinea(AerolineaDto aerolineaDto) {
        this.aerolineasId = aerolineaDto;
    }
}
