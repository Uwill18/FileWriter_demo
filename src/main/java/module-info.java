module filewriter.filewriter_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens filewriter.filewriter_demo to javafx.fxml;
    exports filewriter.filewriter_demo;
}