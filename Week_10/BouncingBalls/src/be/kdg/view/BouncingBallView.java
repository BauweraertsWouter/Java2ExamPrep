package be.kdg.view;

import be.kdg.balls.BallLauncher;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BouncingBallView extends BorderPane {
    private Pane pane = new Pane();
    private Button start = new Button("Launch ball");
    private Button freeze = new Button("Freeze ball");
    private Button exit = new Button("Exit");
    private Label teller = new Label("0 Bouncing Balls");

    public BouncingBallView() {
        maakLayout();
        voegListenersToe();
    }

    private void maakLayout() {
        HBox hBox = new HBox(20);
        hBox.getChildren().addAll(start, freeze, teller, exit);
        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.CENTER);
        hBox.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setCenter(pane);
        this.setBottom(hBox);
    }

    private void voegListenersToe() {
        //Vul aan
        start.setOnAction(e -> {
            BallLauncher.launch(pane);
            teller.setText(String.format("%d Bouncing Balls", BallLauncher.getCount()));
        });
        freeze.setOnAction(event -> {
            BallLauncher.freeze();
            teller.setText(BallLauncher.getCount() + "Bouncing Balls");
        });
        exit.setOnAction(event -> System.exit(0));
    }
}
