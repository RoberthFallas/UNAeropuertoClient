/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.unaeropuertoclient.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import org.una.unaeropuertoclient.model.AuthenticationResponse;
import org.una.unaeropuertoclient.service.UsuarioService;
import org.una.unaeropuertoclient.utils.AppContext;
import org.una.unaeropuertoclient.utils.FlowController;
import org.una.unaeropuertoclient.utils.Mensaje;
import org.una.unaeropuertoclient.utils.Respuesta;

/**
 * FXML Controller class
 *
 * @author Roberth :)
 */
public class LoginController extends Controller implements Initializable {

    @FXML
    public JFXTextField txtCedula;
    @FXML
    public JFXPasswordField txtContrasenna;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void initialize() {
    }

    @FXML
    public void onActionSalir(ActionEvent event) {
        this.getStage().close();
    }

    @FXML
    public void onActionIngresar(ActionEvent event) {
        Respuesta resp = new UsuarioService().logIn(txtCedula.getText(), txtContrasenna.getText());
        if (resp.getEstado()) {
            AppContext.getInstance().set("Token", ((AuthenticationResponse) resp.getResultado("data")).getJwt());
            AppContext.getInstance().get("Token");
            FlowController.getInstance().goMain();
            FlowController.getInstance().goView("MenuPrincipal");
            FlowController.getInstance().goView("MenuSuperior", "Top", null);
            this.getStage().close();
        } else {
            new Mensaje().showModal(Alert.AlertType.WARNING, "Algo ha ocurrido", this.getStage(), resp.getMensaje());
        }
    }

}
