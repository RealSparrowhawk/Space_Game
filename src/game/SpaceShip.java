package game;

import java.awt.Rectangle;
import java.awt.Color;

public class SpaceShip extends Rectangle {
    //Notes: x,y,width,height (all ints) come from Rectangle

    double xx, yy; //Double version of x,y for precise moving
    double vx = 3.5;
    double vy = 3.5;
    Color clr = Color.GREEN; //TODO: make the enemy one a different colour

    SpaceShip() {
        xx = 200.0;
        yy = 700.0;

        x = (int) xx;
        y = (int) yy;
        width = 50;
        height = 30;
    }
}
