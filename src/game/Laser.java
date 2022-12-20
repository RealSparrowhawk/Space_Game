package game;

import java.awt.*;
/* This will just be moving vertically (initially)
 */
public class Laser extends Rectangle {

    Color clr = Color.YELLOW;
    int range = 1500; //how many pixels the laser will go
    Laser(SpaceShip player) {
        width = 2;
        height = 10;

    }
}
