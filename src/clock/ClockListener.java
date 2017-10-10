/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.Calendar;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Arturo M
 */
public class ClockListener {

    private final Clock model;
    private final ClockPanel view;

    public ClockListener(Clock model, ClockPanel view) {
        this.model = model;
        this.view = view;
    }

    public void printHours(int numero) {
        model.getDigit1().drawDigits((int) (numero / 10));
        model.getDigit2().drawDigits(numero % 10);
    }

    public void printMinutes(int numero) {
        model.getDigit3().drawDigits((int) (numero / 10));
        model.getDigit4().drawDigits(numero % 10);
    }

    public void printSeconds(int numero) {
        model.getDigit5().drawDigits((int) (numero / 10));
        model.getDigit6().drawDigits(numero % 10);
    }

    public void startClock() {

        TimerTask clockUpdateTask = new TimerTask() {
            @Override
            public void run() {
                updateTime();
            }

        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(clockUpdateTask, 0, 1000);
    }

    public void updateTime() {
        Calendar timer = Calendar.getInstance();
        printSeconds(timer.get(Calendar.SECOND));
        printMinutes(timer.get(Calendar.MINUTE));
        printHours(timer.get(Calendar.HOUR));
        view.repaint();
    }
}
