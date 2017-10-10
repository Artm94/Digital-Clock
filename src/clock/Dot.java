/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Arturo M
 */
public class Dot extends Point{
    protected int radio;
    protected Color color;
    protected int dirY;
    protected int dirX;
    
    public Dot(Color color){
        this.color = color;
        
    }
    
    public void setCoords(int x, int y, int radio){
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x-radio, y-radio, radio*2, radio*2);
        g.setColor(Color.black);
        g.drawOval(x-radio, y-radio, radio*2, radio*2);
    }
    

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the dirY
     */
    public int getDirY() {
        return dirY;
    }

    /**
     * @param dirY the dirY to set
     */
    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    /**
     * @return the dirX
     */
    public int getDirX() {
        return dirX;
    }

    /**
     * @param dirX the dirX to set
     */
    public void setDirX(int dirX) {
        this.dirX = dirX;
    }
    
}
