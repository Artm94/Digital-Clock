/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Arturo M
 */
public class DigitSegment {

    private boolean state;
    private int width;
    private int height;
    private int posX;
    private int posY;
    private Color color;

    public DigitSegment(boolean state, Color color) {
        this.color = color;
        this.state = state;
    }

    public DigitSegment(Color color) {
        this(false, color);
    }

    public DigitSegment(boolean state, int posX, int posY, int ancho, int alto, Color color) {
        this.color = color;
        this.state = state;
        this.width = ancho;
        this.height = alto;
        this.posX = posX;
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    

    public void draw(Graphics g) {
        if (state) {
            g.setColor(getColor());
            g.fillRoundRect(getPosX(), getPosY(), width, height, 50, 50);
        }
    }

    /**
     * @return the state
     */
    public boolean getSegmentState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setSegmentState(boolean state) {
        this.state = state;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param heigth the height to set
     */
    public void setHeight(int heigth) {
        this.height = heigth;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

}
