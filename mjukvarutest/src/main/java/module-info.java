module com.example.mjukvarutest {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.mjukvarutest to javafx.fxml;
    exports com.example.mjukvarutest;
    exports Morse to junit;
}