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
public class NumericalDigit {

    private int iniX;
    private int iniY;
    private int width;
    private int height;
    private final DigitSegment segment1;
    private final DigitSegment segment2;
    private final DigitSegment segment3;
    private final DigitSegment segment4;
    private final DigitSegment segment5;
    private final DigitSegment segment6;
    private final DigitSegment segment7;
    private Color color;

    public NumericalDigit(Color color) {
        this.color = color;
        segment1 = new DigitSegment(color);
        segment2 = new DigitSegment(color);
        segment3 = new DigitSegment(color);
        segment4 = new DigitSegment(color);
        segment5 = new DigitSegment(color);
        segment6 = new DigitSegment(color);
        segment7 = new DigitSegment(color);
        changeState(0, false);
    }

    public void setCoords(int iniX, int iniY, int ancho, int alto) {
        this.iniX = iniX;
        this.iniY = iniY;
        this.width = ancho;
        this.height = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        segment1.setColor(color);
        segment2.setColor(color);
        segment3.setColor(color);
        segment4.setColor(color);
        segment5.setColor(color);
        segment6.setColor(color);
        
    }

    public void draw(Graphics g) {
        placeSegments();
        drawSegments(g);
    }

    public void drawSegments(Graphics g) {
        segment1.draw(g);
        segment2.draw(g);
        segment3.draw(g);
        segment4.draw(g);
        segment5.draw(g);
        segment6.draw(g);
        segment7.draw(g);
    }

    public void drawDigits(int number) {
        changeState(0, false);
        switch (number) {
            case 0:
                changeState(1, true);
                changeState(2, true);
                changeState(3, true);
                changeState(5, true);
                changeState(6, true);
                changeState(7, true);
                break;
            case 1:
                changeState(3, true);
                changeState(6, true);
                break;
            case 2:
                changeState(1, true);
                changeState(3, true);
                changeState(4, true);
                changeState(5, true);
                changeState(7, true);
                break;
            case 3:
                changeState(1, true);
                changeState(3, true);
                changeState(4, true);
                changeState(6, true);
                changeState(7, true);
                break;
            case 4:
                changeState(2, true);
                changeState(3, true);
                changeState(4, true);
                changeState(6, true);
                break;
            case 5:
                changeState(1, true);
                changeState(2, true);
                changeState(4, true);
                changeState(6, true);
                changeState(7, true);
                break;
            case 6:
                changeState(1, true);
                changeState(2, true);
                changeState(4, true);
                changeState(5, true);
                changeState(6, true);
                changeState(7, true);
                break;
            case 7:
                changeState(1, true);
                changeState(3, true);
                changeState(6, true);
                break;
            case 8:
                changeState(0, true);
                break;
            case 9:
                changeState(1, true);
                changeState(2, true);
                changeState(3, true);
                changeState(4, true);
                changeState(6, true);
                break;
        }
    }

    public void placeSegments() {
        segment1.setPosX((int) (iniX + (width * 0.05)));
        segment1.setPosY((int) (iniY));
        segment1.setWidth((int) (width * 0.90));
        segment1.setHeight((int) (height * 0.05));

        segment2.setPosX((int) (iniX));
        segment2.setPosY(((int) (iniY + (height * 0.05))));
        segment2.setWidth((int) (width * 0.10));
        segment2.setHeight((int) (height * 0.40));

        segment3.setPosX(iniX + segment1.getWidth());
        segment3.setPosY(((int) (iniY + (height * 0.05))));
        segment3.setWidth((int) (width * 0.10));
        segment3.setHeight((int) (height * 0.40));

        segment4.setPosX((int) (iniX + (width * 0.05)));
        segment4.setPosY((int) (height * 0.57));
        segment4.setWidth((int) (width * 0.90));
        segment4.setHeight((int) (height * 0.05));

        segment5.setPosX((int) (iniX));
        segment5.setPosY((int) ((iniY + (height * 0.05)) + segment2.getHeight() + segment4.getHeight()));
        segment5.setWidth((int) (width * 0.10));
        segment5.setHeight((int) (height * 0.40));

        segment6.setPosX(iniX + segment1.getWidth());
        segment6.setPosY((int) ((iniY + (height * 0.05)) + segment2.getHeight() + segment4.getHeight()));
        segment6.setWidth((int) (width * 0.10));
        segment6.setHeight((int) (height * 0.40));

        segment7.setPosX((int) (iniX + (width * 0.05)));
        segment7.setPosY((int) (height + (height * 0.02)));
        segment7.setWidth((int) (width * 0.90));
        segment7.setHeight((int) (height * 0.05));
    }

    private void changeState(int segment, boolean state) {
        switch (segment) {
            case 1:
                segment1.setSegmentState(state);
                break;
            case 2:
                segment2.setSegmentState(state);
                break;
            case 3:
                segment3.setSegmentState(state);
                break;
            case 4:
                segment4.setSegmentState(state);
                break;
            case 5:
                segment5.setSegmentState(state);
                break;
            case 6:
                segment6.setSegmentState(state);
                break;
            case 7:
                segment7.setSegmentState(state);
                break;
            default:
                segment1.setSegmentState(state);
                segment2.setSegmentState(state);
                segment3.setSegmentState(state);
                segment4.setSegmentState(state);
                segment5.setSegmentState(state);
                segment6.setSegmentState(state);
                segment7.setSegmentState(state);
        }
    }

}
