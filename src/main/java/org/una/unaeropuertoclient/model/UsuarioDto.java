/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.time.LocalDate;
import java.util.List;
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
@XmlRootElement(name = "UsuarioDto")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class UsuarioDto {

    @XmlTransient
    public Long id;
    @XmlTransient
    public SimpleStringProperty cedula;
    @XmlTransient
    public SimpleStringProperty nombre;
    @XmlTransient
    public SimpleStringProperty apellidos;
    @XmlTransient
    public SimpleStringProperty contrasenna;
    @XmlTransient
    private SimpleObjectProperty<LocalDate> fechaNacimiento;
    private LocalDate fechaIngreso;
    private LocalDate fechaModificacion;
    private Boolean activo;
    private List<BitacoraDto> bitacoraList;
    private List<RolUsuarioDto> rolUsuarioList;
    private AreaDto areasId;

    public UsuarioDto() {
        cedula = new SimpleStringProperty();
        nombre = new SimpleStringProperty();
        apellidos = new SimpleStringProperty();
        contrasenna = new SimpleStringProperty();
        fechaNacimiento = new SimpleObjectProperty();
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
        return fechaNacimiento.get();

    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento.set(DateConverter.toLocalDate(fechaNacimiento));
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = DateConverter.toLocalDate(fechaIngreso);
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = DateConverter.toLocalDate(fechaModificacion);
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
