/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LordLalo
 */
@XmlRootElement(name = "AuthenticationResponse")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AuthenticationResponse {

    private String jwt;
    private UsuarioDto usuario;
    private List<RolUsuarioDto> rolUsuario;

    public String getJwt() {
        return jwt;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public List<RolUsuarioDto> getRolUsuario() {
        return rolUsuario;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public void setRolUsuario(List<RolUsuarioDto> rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

}
