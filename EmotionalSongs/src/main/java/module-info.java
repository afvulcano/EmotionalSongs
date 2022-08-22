module com.esongs.emotionalsongs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.esongs.emotionalsongs to javafx.fxml;
    exports com.esongs.emotionalsongs;
}