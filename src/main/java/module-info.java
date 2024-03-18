module com.singleton.proyectu2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.singleton.proyectu2 to javafx.fxml;
    exports com.singleton.proyectu2;
}