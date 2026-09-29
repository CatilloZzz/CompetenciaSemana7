module ni.edu.uam.competenciasemana7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.competenciasemana7 to javafx.fxml;
    exports ni.edu.uam.competenciasemana7;
}