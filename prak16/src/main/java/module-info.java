module com.example._7lab {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example._6lab to javafx.fxml;
    exports com.example._6lab;
}