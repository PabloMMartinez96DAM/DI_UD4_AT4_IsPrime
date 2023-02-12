module com.profesor.primo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.profesor.primo to javafx.fxml;
    exports com.profesor.primo;
}