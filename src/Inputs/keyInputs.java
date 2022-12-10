package Inputs;

import Main.Panel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*

    Difference Between extends and implements
  - You can only extend a class, You can't implement one
  - you can only implement an interface, you can't add onto one
 */


public class keyInputs implements KeyListener {
// This code will listen for the different key inputs that will happen
    private Panel panel;
    // Constructor
    public keyInputs(Panel panel){
        this.panel = panel;
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                panel.changeYDelta(-5);
                break;
            case KeyEvent.VK_A:
                panel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                panel.changeYDelta(5);
                break;
            case KeyEvent.VK_D:
                panel.changeXDelta(5);
                break;
        }
    }
}
