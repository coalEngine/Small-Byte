package Main;

public class World {
    private Screen screen;
    private Panel panel;
    public World(){
        panel = new Panel();
        screen = new Screen(panel);
    }
}
