package Main;

import Inputs.keyInputs;
import Inputs.mouseInputs;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


// We use this class to draw the graphics onto the screen
 // and tell those graphics what to do, on a specific event
public class Panel extends JPanel {
    private mouseInputs mousemotionInputs;
    private float xDelta = 100, yDelta = 100;
    private BufferedImage img;

    /* these functions tell our panel to listen to these events, and to print
      graphics onto the screen
     */
    public Panel() {
        mousemotionInputs = new mouseInputs(this);
        importImage();
        addKeyListener(new keyInputs(this));
        addMouseListener(new mouseInputs(this));
        addMouseMotionListener(mousemotionInputs);
        setPanelSize();
    }

    /*
     This function searches for a resource directory that has the file
     (spritesheet) inside. Note: (This won't work if you don't make the directory
     a resource directory first)
    */

    private void importImage() {
        InputStream is = getClass().getResourceAsStream("/small_byte_2.png");
        try{
            img = ImageIO.read(is);
        }catch(IOException evt){
            evt.printStackTrace();
        }
    }

    // This panel function will lock the panel to a default size
    // (impossible to resize)
    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    // Change x and y positions

    public void changeXDelta(int value){
        this.xDelta += value;

    }
    public void changeYDelta(int value){
        this.yDelta += value;

    }


    // Moves object using mouse events
    public void setObject(int x, int y){
        this.xDelta = x;
        this.yDelta = y;

    }



    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // g.drawImage(null, x, y, null);
    }
}
