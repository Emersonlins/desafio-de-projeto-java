module exemplo.banco.desafiodeprojetojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens exemplo.banco.desafiodeprojetojava to javafx.fxml;
    exports exemplo.banco.desafiodeprojetojava;
}