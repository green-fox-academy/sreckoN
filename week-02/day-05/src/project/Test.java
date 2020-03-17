package project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.red);

        /*int baseSize = 20;
        drawATriangle(new int[] {0, baseSize / 2, baseSize}, new int[] {HEIGHT, HEIGHT - baseSize, HEIGHT}, graphics);
        drawATriangle(new int[] {20, baseSize + baseSize / 2, 2 * baseSize}, new int[] {HEIGHT, HEIGHT - baseSize, HEIGHT}, graphics);
        drawATriangle(new int[] {40, 2*baseSize + baseSize / 2, 3 * baseSize}, new int[] {HEIGHT, HEIGHT - baseSize, HEIGHT}, graphics);
*/
        makeAPyramid(graphics);

    }

    public static void makeAPyramid(Graphics graphics) {
        int baseSize = 20;

        /*int[] y = new int[] {HEIGHT, HEIGHT - baseSize, HEIGHT};
        int count = 0;
        for (int x = 0; x < WIDTH; x += 20) {
            int[] xPoints = new int[] {x, x + (baseSize / 2), (1 + count++) * baseSize};

            drawATriangle(xPoints, y, graphics);
        }*/

        int count = 0;
        int narrow = WIDTH;
        int[] first = new int[] {0, HEIGHT - baseSize};
        for (int i = 0; i < narrow; i += 20) {
            int yBegEnd = HEIGHT - i;
            int yPeak = HEIGHT - i - baseSize;
            first[1] = yPeak;
            int[] y = new int[] {yBegEnd, HEIGHT - i - baseSize, yBegEnd};
            for (int x = 0; x < WIDTH; x += 20) {
                int[] xPoints = new int[] {first[0], x + (baseSize / 2), (1 + count++) * baseSize};
                first[0] = x + (baseSize / 2);
                drawATriangle(xPoints, y, graphics);
            }
            narrow -= baseSize;
        }

    }

    public static void drawATriangle(int[] x, int[] y, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(x, y, 3);
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
