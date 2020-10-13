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
@XmlRootElement(name = "UsuarioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class UsuarioDto {

    private Long id;
    @XmlTransient
    public SimpleStringProperty cedula;
    @XmlTransient
    public SimpleStringProperty nombre;
    @XmlTransient
    public SimpleStringProperty apellidos;
    @XmlTransient
    private SimpleStringProperty contrasenna;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private LocalDate fechaModificacion;
    private Boolean activo;
    private List<BitacoraDto> bitacoraList;
    private List<RolUsuarioDto> rolUsuarioList;
    private AreaDto areasId;

    private UsuarioDto() {
        cedula = new SimpleStringProperty();
        nombre = new SimpleStringProperty();
        apellidos = new SimpleStringProperty();
        contrasenna = new SimpleStringProperty();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula.get();
    }

    public void setCedula(String cedula) {
        this.cedula.set(cedula);
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }

    public String getContrasenna() {
        return contrasenna.get();
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna.set(contrasenna);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        Date date = Date.from(fechaIngreso.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaModificacion() {
        Date date = Date.from(fechaModificacion.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return DateConverter.convertToSpringBoot(date);
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<BitacoraDto> getBitacoraList() {
        return bitacoraList;
    }

    public void setBitacoraList(List<BitacoraDto> bitacoraList) {
        this.bitacoraList = bitacoraList;
    }

    public List<RolUsuarioDto> getRolUsuarioList() {
        return rolUsuarioList;
    }

    public void setRolUsuarioList(List<RolUsuarioDto> rolUsuarioList) {
        this.rolUsuarioList = rolUsuarioList;
    }

    public AreaDto getAreasId() {
        return areasId;
    }

    public void setAreasId(AreaDto areasId) {
        this.areasId = areasId;
    }

}
