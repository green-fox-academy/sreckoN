package drawing;

import javax.swing.*;
import java.awt.*;

public class HorizontalLines {

    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.
        for (int i = 0; i < 10; i++) {
            int randomX = (int) (Math.random() * (HEIGHT - 50));
            int randomY = (int) (Math.random() * (HEIGHT - 50));
            drawALine(randomX, randomY, graphics);
        }
    }

    public static void drawALine(int x, int y, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, y, x + 50, y + 50);
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
