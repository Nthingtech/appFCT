module tux.appfct {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens tux.appfct to javafx.fxml;
    exports tux.appfct;
}