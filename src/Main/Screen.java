package Main;

import javax.swing.JFrame;

public class Screen {
    private JFrame jFrame;
    public Screen(Panel p){
        jFrame = new JFrame();
        jFrame.setSize(400, 350);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(p);
        jFrame.setVisible(true);
    }
}
