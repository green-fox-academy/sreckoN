package drawing;

import javax.swing.*;
import java.awt.*;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        connectTheDots(new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}}, graphics);
    }

    public static void connectTheDots(int[][] dots, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < dots.length - 1; i++) {
            int[] pair1 = dots[i];
            int[] pair2 = dots[i + 1];

            if (i == 0) {
                int[] lastPair = dots[dots.length - 1];
                graphics.drawLine(pair1[0], pair1[1], lastPair[0], lastPair[1]);
            }

            graphics.drawLine(pair1[0], pair1[1], pair2[0], pair2[1]);
        }
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
