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
public class Clock {

    private int windowWidth;
    private int windowHeight;
    private final NumericalDigit digit1;
    private final NumericalDigit digit2;
    private final NumericalDigit digit3;
    private final NumericalDigit digit4;
    private final NumericalDigit digit5;
    private final NumericalDigit digit6;
    private final Dot dot1;
    private final Dot dot2;
    private final Dot dot3;
    private final Dot dot4;
    private static final Color DEFAULT_COLOR = Color.RED;
    private Color color;

    public Clock(Color color) {
        this.color = color;
        digit1 = new NumericalDigit(color);
        digit2 = new NumericalDigit(color);
        digit3 = new NumericalDigit(color);
        digit4 = new NumericalDigit(color);
        digit5 = new NumericalDigit(color);
        digit6 = new NumericalDigit(color);
        dot1 = new Dot(color);
        dot2 = new Dot(color);
        dot3 = new Dot(color);
        dot4 = new Dot(color);

    }

    public Clock() {
        this(DEFAULT_COLOR);
    }

    public void draw(Graphics g) {
        digit1.setCoords((int) (getWindowWidth() * 0.05), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        digit2.setCoords((int) (getWindowWidth() * 0.18), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        dot1.setCoords((int) (getWindowWidth() * 0.331), (int) (getWindowHeight() * 0.35), (int) (getWindowHeight() * 0.05));
        dot2.setCoords((int) (getWindowWidth() * 0.331), (int) (getWindowHeight() * 0.60), (int) (getWindowHeight() * 0.05));
        digit3.setCoords((int) (getWindowWidth() * 0.37), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        digit4.setCoords((int) (getWindowWidth() * 0.50), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        dot3.setCoords((int) (getWindowWidth() * 0.651), (int) (getWindowHeight() * 0.35), (int) (getWindowHeight() * 0.05));
        dot4.setCoords((int) (getWindowWidth() * 0.651), (int) (getWindowHeight() * 0.60), (int) (getWindowHeight() * 0.05));
        digit5.setCoords((int) (getWindowWidth() * 0.69), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        digit6.setCoords((int) (getWindowWidth() * 0.82), (int) (getWindowHeight() * 0.10), (int) (getWindowWidth() * 0.12), (int) (getWindowHeight() * 0.80));
        digit1.draw(g);
        digit2.draw(g);
        digit3.draw(g);
        digit4.draw(g);
        digit5.draw(g);
        digit6.draw(g);
        dot1.draw(g);
        dot2.draw(g);
        dot3.draw(g);
        dot4.draw(g);
    }

    public NumericalDigit getDigit1() {
        return digit1;
    }

    public NumericalDigit getDigit2() {
        return digit2;
    }

    public NumericalDigit getDigit3() {
        return digit3;
    }

    public NumericalDigit getDigit4() {
        return digit4;
    }

    public NumericalDigit getDigit5() {
        return digit5;
    }

    public NumericalDigit getDigit6() {
        return digit6;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        digit1.setColor(color);
        digit2.setColor(color);
        digit3.setColor(color);
        digit4.setColor(color);
        digit5.setColor(color);
        digit6.setColor(color);
        dot1.setColor(color);
        dot2.setColor(color);
        dot3.setColor(color);
        dot4.setColor(color);
        
    }

    public Dot getDot1() {
        return dot1;
    }

    public Dot getDot2() {
        return dot2;
    }

    public Dot getDot3() {
        return dot3;
    }

    public Dot getDot4() {
        return dot4;
    }

    /**
     * @return the windowWidth
     */
    public int getWindowWidth() {
        return windowWidth;
    }

    /**
     * @param windowWidth the windowWidth to set
     */
    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    /**
     * @return the windowHeight
     */
    public int getWindowHeight() {
        return windowHeight;
    }

    /**
     * @param windowHeight the windowHeight to set
     */
    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

}
