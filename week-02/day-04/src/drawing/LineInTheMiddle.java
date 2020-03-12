package drawing;

import javax.swing.*;
import java.awt.*;

public class LineInTheMiddle {

    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        graphics.setColor(Color.RED);
        graphics.drawLine(0, 0, 160, 160);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(160, 160, 320, 320);
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
