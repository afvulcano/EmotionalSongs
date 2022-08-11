module com.esongs.emotionalsongs {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.iconli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome;

    opens com.esongs.emotionalsongs to javafx.fxml;
    exports com.esongs.emotionalsongs;
}