module com.example.typer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.typer to javafx.fxml;
    exports com.example.typer;
    exports com.example.typer.ProjectPrototype;
    opens com.example.typer.ProjectPrototype to javafx.fxml;
    exports com.example.typer.MyWork;
    opens com.example.typer.MyWork to javafx.fxml;
}