module com.example.javafxgradlemodule {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.bouncycastle.provider;

    opens com.example.javafxgradlemodule to javafx.fxml;
    exports com.example.javafxgradlemodule;
}