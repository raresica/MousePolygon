package main.application;

import javax.swing.*;
import java.awt.*;

public class Problem {
    public Problem(){

    }

    public void startProblem(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new JFrame("Draw polygon with mouse");
                Mouse mouse = new Mouse();
                jFrame.add(mouse);
                jFrame.addMouseListener(mouse);
                jFrame.pack();

                jFrame.setLocationRelativeTo(null);
                jFrame.setResizable(false);
                jFrame.setVisible(true);

                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
