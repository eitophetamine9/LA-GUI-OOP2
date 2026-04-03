module com.example.la_gui_oop2_ {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.la_gui_oop2_ to javafx.fxml;
    exports com.example.la_gui_oop2_;
}