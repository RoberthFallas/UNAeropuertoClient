module org.una.unaeropuertoclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.ws.rs;
    requires java.base;
    requires com.jfoenix;
    requires java.sql;

    opens org.una.unaeropuertoclient to javafx.fxml;
    exports org.una.unaeropuertoclient;
    exports org.una.unaeropuertoclient.controller;
    exports org.una.unaeropuertoclient.model;
}
