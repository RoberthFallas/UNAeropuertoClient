/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.controller;

import java.net.URL;
import java.net.http.HttpResponse;
import java.sql.Timestamp;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.fxml.Initializable;
import org.una.unaeropuertoclient.utils.RequestHTTP;
import org.una.unaeropuertoclient.model.AuthenticationResponse;
import org.una.unaeropuertoclient.model.BitacoraDto;
import org.una.unaeropuertoclient.utils.AppContext;

/**
 * FXML Controller class
 *
 * @author roberth :)
 */
public class MenuPrincipalController extends Controller implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        Gson gson = new GsonBuilder()
                .setDateFormat("yyy-MM-dd'T'HH:mm:ss.SSSX").create();



        AuthenticationResponse authentication = (AuthenticationResponse) AppContext.getInstance().get("token");
        BitacoraDto bitacoraDto =  new BitacoraDto(new Timestamp(System.currentTimeMillis()), "Se Ingresa al sistema",  authentication.getUsuario());
        System.out.println(bitacoraDto.getFechaModificacion().getTime());
        RequestHTTP requestHTTP = new RequestHTTP();

        HttpResponse  response =   requestHTTP.post("biatacoras/create", gson.toJson(bitacoraDto));

        System.out.println(response.statusCode() + ": " + response.body());
    }

    @Override
    public void initialize() {
    }

}
