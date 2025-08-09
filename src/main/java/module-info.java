module co.edu.uniquindio.guiveterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.guiveterinaria to javafx.fxml;
    exports co.edu.uniquindio.guiveterinaria;
    exports co.edu.uniquindio.guiveterinaria.viewController;
    opens co.edu.uniquindio.guiveterinaria.viewController to javafx.fxml;

}