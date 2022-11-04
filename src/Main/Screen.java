package Main;

import javax.swing.JFrame;

public class Screen {
    // Screen/Window Handling
    private JFrame jFrame;
    public Screen(Panel p){
        // Frame on which the game will run on
        jFrame = new JFrame();
        jFrame.setSize(400, 350);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(p);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
