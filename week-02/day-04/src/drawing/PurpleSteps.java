package drawing;

import javax.swing.*;
import java.awt.*;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        int oneThird = ((WIDTH * 3) / 4);
        for (int i = 10; i < oneThird; i += 20) {
            drawASquare(i, i, graphics);
        }

    }

    public static void drawASquare(int x, int y, Graphics graphics) {
        int size = 18;
        graphics.setColor(new Color(143,0,255));
        graphics.fillRect(x+1, y+1, size, size);

        graphics.setColor(Color.BLACK);
        graphics.drawLine(x, y, x + size + 1, y);
        graphics.drawLine(x, y, x, y + size + 1);
        graphics.drawLine(x, y + size + 1, x + size + 1, y + size + 1);
        graphics.drawLine(x + size + 1, y, x + size + 1, y + size + 1);
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
