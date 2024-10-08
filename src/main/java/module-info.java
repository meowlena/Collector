module com.meowlena.collector {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.meowlena.collector to javafx.fxml;
    exports com.meowlena.collector;
    exports com.meowlena.collector.collections;
    opens com.meowlena.collector.collections to javafx.fxml;
    exports com.meowlena.collector.itens;
    opens com.meowlena.collector.itens to javafx.fxml;
}