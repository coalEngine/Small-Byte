package Inputs;

import Main.Panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mouseInputs implements MouseListener, MouseMotionListener {
       private Panel panel;
       // Constructor
        public mouseInputs(Panel panel){
            this.panel = panel;
        }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click!");
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

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        panel.setObject(e.getX(), e.getY());
    }
}
