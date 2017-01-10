package be.kdg.balls;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball {
    public final int RADIUS = 20;
    private Timeline timeline;
    private Circle circle;
    private Pane box;
    private int x;
    private int y;
    private int dx = 5;
    private int dy = 5;

    public Ball(Pane pane, Color color, int x, int y) {
        circle = new Circle(x, y, RADIUS);
        box = pane;
        box.getChildren().add(circle);
        circle.setFill(color);
        this.x = x;
        this.y = y;
        timeline = new Timeline(new KeyFrame(Duration.millis(20), e -> moveBall()));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    public void moveBall() {
        x += dx;
        y += dy;

        // Controleer grenzen
        if (x < RADIUS || x > box.getWidth() - RADIUS) {
            dx *= -1; //Verander van richting
        }
        if (y < RADIUS || y > box.getHeight() - RADIUS) {
            dy *= -1; //Verander van richting
        }
        circle.setCenterX(x);
        circle.setCenterY(y);
    }

    public void run() {
        timeline.play();
    }

    public void pause() {
        timeline.pause();
    }
}
