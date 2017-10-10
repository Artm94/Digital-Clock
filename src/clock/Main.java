/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javax.swing.JFrame;

/**
 *
 * @author Arturo M
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Simple Digital Clock");
        Clock model = new Clock();
        ClockPanel view = new ClockPanel(model);
        ClockListener listener = new ClockListener(model, view);
        frame.setSize(800, 300);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view);
        listener.startClock();
        frame.setVisible(true);
    }

}
