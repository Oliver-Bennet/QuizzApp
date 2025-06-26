module com.vdn.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vdn.mavenproject3 to javafx.fxml;
    exports com.vdn.mavenproject3;
}
