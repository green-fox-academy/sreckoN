package drawing;

import javax.swing.*;
import java.awt.*;

public class StarryNight {

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        drawStarryNight(graphics);
    }

    public static void drawStarryNight(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < 50; i++) {
            int randomX = (int) (Math.random() * WIDTH);
            int randomY = (int) (Math.random() * HEIGHT);
            drawAStar(randomX, randomY, graphics);
        }

    }

    private static void drawAStar(int x, int y, Graphics graphics) {
        Color[] grays = new Color[]{new Color(85,85,85), new Color(103,103,103), new Color(169,169,169)};
        int color = ((int) ((Math.random()) * 20)) / 10;
        graphics.setColor(grays[color]);
        graphics.fillRect(x, y, 5, 5);
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
