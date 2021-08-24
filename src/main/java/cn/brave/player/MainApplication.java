package cn.brave.player;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.WebServiceProvider;

/**
 * @author Brave
 * @create 2021-08-23 20:22
 * @description
 **/
public class MainApplication extends Application {

    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    @Override
    public void init() throws Exception {
        logger.info("MainApplication Init");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
