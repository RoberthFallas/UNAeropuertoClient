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
@XmlRootElement(name = "BitacoraDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class BitacoraDto {

    private Long id;
    @XmlTransient
    public LocalDateTime fechaModificacion;
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
        return DateConverter.toSpringDateTime(fechaModificacion);
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = DateConverter.toLocalDateTime(fechaModificacion);
    }

    public String getTipoCambio() {
        return tipoCambio.get();
    }

    public void setTipoCambio(SimpleStringProperty tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

}
