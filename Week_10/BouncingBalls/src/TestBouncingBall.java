import be.kdg.view.BouncingBallView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestBouncingBall extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final BouncingBallView view = new BouncingBallView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Bouncing Balls");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
