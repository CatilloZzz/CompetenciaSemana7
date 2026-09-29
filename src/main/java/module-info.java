module ni.edu.uam.competenciasemana7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.competenciasemana7 to javafx.fxml;
    exports ni.edu.uam.competenciasemana7;
    exports ni.edu.uam.competenciasemana7.controller;
    opens ni.edu.uam.competenciasemana7.controller to javafx.fxml;
    exports ni.edu.uam.competenciasemana7.models;
    opens ni.edu.uam.competenciasemana7.models to javafx.fxml;
}