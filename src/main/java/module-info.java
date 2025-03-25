module co.edu.uniquindio.gestionproyecto.proyectofinal2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestionproyecto.proyectofinal2fx to javafx.fxml;
    exports co.edu.uniquindio.gestionproyecto.proyectofinal2fx;
}