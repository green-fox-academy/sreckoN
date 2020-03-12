package drawing;

import javax.swing.*;
import java.awt.*;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        boolean black = true;
        Color color = Color.BLACK;

        for (int y = 0; y < WIDTH; y += 20) {
            for (int x = 0; x < HEIGHT; x += 20) {
                drawASquare(x, y, color, graphics);
                if (black) {
                    black = false;
                    color = Color.WHITE;
                } else {
                    black = true;
                    color = Color.BLACK;
                }
            }
            if (black) {
                black = false;
                color = Color.WHITE;
            } else {
                black = true;
                color = Color.BLACK;
            }
        }
    }

    public static void drawASquare(int x, int y, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x, y, 20, 20);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}