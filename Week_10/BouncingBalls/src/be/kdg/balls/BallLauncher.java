package be.kdg.balls;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallLauncher {
    private static final Random random = new Random();
    private static List<Ball> balls = new ArrayList<>();

    public static void launch(Pane pane) {
        Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int x = 15 + random.nextInt((int) pane.getWidth() - 30);
        int y = 15 + random.nextInt((int) pane.getHeight() - 30);
        System.out.println("Nieuwe bal gelanceerd op : " + x + ", " + y);
        // Vul aan
        Ball ball = new Ball(pane, color, x, y);
        balls.add(ball);
        ball.run();
    }

    public static void freeze() {
        // Vul aan
        if (balls.size() > 0) {
            Ball ball = balls.remove(balls.size() - 1);
            ball.pause();
        }
    }

    public static int getCount() {
        // Vul aan
        return balls.size();
    }
}
