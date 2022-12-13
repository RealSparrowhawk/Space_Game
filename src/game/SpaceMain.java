package game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;

public class SpaceMain {
    public static void main(String[] args) {
        //TODO: add in the swingUtilities way of starting graphics
        new SpaceMain();
    }

    int panW = 900;
    int panH = 900;

    DrawingPanel panel;
    SpaceMain() {
        panel = new DrawingPanel();
        JFrame window = new JFrame("Salamder 2");
        window.add(panel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        //timer.start();
    }

    class DrawingPanel extends JPanel {
        DrawingPanel() {
            this.setBackground(Color.BLACK);
            this.setPreferredSize(new Dimension(panW, panH));
        }
    }
}
