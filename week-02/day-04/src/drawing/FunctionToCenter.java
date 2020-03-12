package drawing;

import javax.swing.*;
import java.awt.*;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        /*for (int x = 0; x <= WIDTH; x += 20) {
            drawALine(x, 0, graphics);
        }
        for (int y = 0; y <= HEIGHT; y += 20) {
            drawALine(0, y, graphics);
        }
        for (int x = 0; x <= WIDTH; x += 20) {
            drawALine(x, HEIGHT, graphics);
        }
        for (int y = 0; y <= HEIGHT; y += 20) {
            drawALine(WIDTH, y, graphics);
        }*/
        int yForX = 0;
        for (int i = 1; i < 3; i++) {
            if (i % 2 != 0) yForX = HEIGHT;
            else yForX = 0;
            for (int x = 0; x <= WIDTH; x += 20) {
                drawALine(x, yForX, graphics);
            }
        }

        int xForY = 0;
        for (int i = 1; i < 3; i++) {
            if (i % 2 != 0) xForY = WIDTH;
            else xForY = 0;
            for (int y = 0; y <= HEIGHT; y += 20) {
                drawALine(xForY, y, graphics);
            }
        }
    }

    public static void drawALine(int x, int y, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
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
