/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author Arturo M
 */
public class ClockPanel extends JPanel{
    private final Clock model;

    public ClockPanel(Clock clock) {
        this.model = clock;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
        getModel().setWindowHeight(this.getHeight());
        getModel().setWindowWidth(this.getWidth());
        getModel().draw(g);
    }

    /**
     * @return the model
     */
    public Clock getModel() {
        return model;
    }
}
