module com.example.dictionary {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.dictionary to javafx.fxml;
    exports com.example.dictionary;
}