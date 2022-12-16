package game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpaceMain {
    public static void main(String[] args) {
        //TODO: add in the swingUtilities way of starting graphics
        new SpaceMain();
    }

    //Graphics related
    int panW = 900;
    int panH = 900;
    DrawingPanel panel;

    SpaceShip player = new SpaceShip();
    SpaceMain() {
        panel = new DrawingPanel();
        JFrame window = new JFrame("Salamder 2");
        window.setDefaultCloseOperation(window.DISPOSE_ON_CLOSE);
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
            this.addKeyListener(new BetterKeyListener());
            this.setFocusable(true); //needed for JPanel & keys. Won't detect keys if not true
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(player.clr);
            g.fillRect(player.x, player.y, player.width, player.height);
        }

    } //End of DrawingPanel class

    //Since this is a general class, I'm not going to have it move the player etc.
    //We'll have to use a Timer to check if the keys are pressed.
    class BetterKeyListener implements KeyListener {
        private boolean keysDown[] = new boolean[256];

        public boolean isKeyDown(int key) {
            return keysDown[key];
        }
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() < 256) keysDown[e.getKeyCode()] = true;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 256) keysDown[e.getKeyCode()] = false;
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }
}
