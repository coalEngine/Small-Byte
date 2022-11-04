package Main;

public class World {
    private Screen screen;
    private Panel panel;
    public World(){
        // The game itself
        /*
             loads everything, (Panel and Screen)
        */
        panel = new Panel();
        screen = new Screen(panel);
        panel.requestFocus();
    }
}
