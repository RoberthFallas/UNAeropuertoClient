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
@XmlRootElement(name = "BitacoraDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class BitacoraDto {

    private Long id;
    @XmlTransient
    public LocalDate fechaModificacion;
    @XmlTransient
    public SimpleStringProperty tipoCambio;
//    @Setter(AccessLevel.NONE)
//    private UsuarioDto usuariosId;

    public BitacoraDto() {
        tipoCambio = new SimpleStringProperty();
        id = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaModificacion() {
        Date date = Date.from(fechaModificacion.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getTipoCambio() {
        return tipoCambio.get();
    }

    public void setTipoCambio(SimpleStringProperty tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

}
