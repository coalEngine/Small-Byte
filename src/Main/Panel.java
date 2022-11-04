package Main;

import Inputs.keyInputs;
import Inputs.mouseInputs;

import javax.swing.JPanel;
import java.awt.Graphics;

// We use this class to draw the graphics onto the screen
 // and tell those graphics what to do, on a specific event
public class Panel extends JPanel {
    private mouseInputs mousemotionInputs;
    private int xDelta = 100, yDelta = 100;
    public Panel(){
        mousemotionInputs = new mouseInputs(this);
        addKeyListener(new keyInputs(this));
        addMouseListener(new mouseInputs(this));
        addMouseMotionListener(mousemotionInputs);
    }

    // Change x and y positions
    public void changeXDelta(int value){
        this.xDelta += value;
        repaint();
    }
    public void changeYDelta(int value){
        this.yDelta += value;
        repaint();
    }
    // Moves object using mouse events
    public void setObject(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(xDelta, yDelta, 30, 30);
    }
}
