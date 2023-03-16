module com.nth.appqlbh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.nth.appqlbh to javafx.fxml;
    exports com.nth.appqlbh;
    exports com.nth.pojo;
}
