/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.model;

import java.util.List;

public class TipoServicioDto {

    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean avtivo;
    private List<ServicioMantenimientoDto> servicioMantenimientoList;
}
