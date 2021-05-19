package main.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Mouse extends JPanel implements MouseListener {
    private List<main.application.Point> pointList;

    public Mouse(){
        pointList = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        //pentru orice linii, poligon
        for(int i = 0; i < pointList.size() - 1; i++){
            graphics.drawLine((int) pointList.get(i).getX(),
                    (int) pointList.get(i).getY(),
                    (int) pointList.get(i + 1).getX(),
                    (int) pointList.get(i + 1).getY());
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(900, 900);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        savePoint(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void savePoint(MouseEvent e){
        pointList.add(new Point(e.getX(), e.getY()));

        if(pointList.size() >= 2) {
            repaint();
        }
    }
}
