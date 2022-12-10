package Main;


public class World implements Runnable{
    private Screen screen;
    private Panel panel;
    private Thread worldThread;
    private final int FPS_IDEAL = 120;
    public World() {
        // The game itself
        /*
             loads everything, (Panel and Screen)
        */
        panel = new Panel();
        screen = new Screen(panel);
        panel.requestFocus();
        startWorldLoop();
    }

    /*
     (this function) Runs the world loop on its own thread, which means
      it will run independantly from the other tasks happening at the
      same time. This reduces lag greatly
    */
    private void startWorldLoop(){
        worldThread = new Thread(this);
        worldThread.start();
    }

    /*
        Creates the game loop, Tracks FPS
    */
    @Override
    public void run() {
        double time_per_frame = 1000000000.0 / FPS_IDEAL;
        long lastFrame = System.nanoTime();
        long now;

        int frames = 0;
        long lastCheck = System.currentTimeMillis();

        while(true){
            now = System.nanoTime();
            if(now - lastFrame >= time_per_frame){
                panel.repaint();
                lastFrame = now;
                frames++;
            }
            if(System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                frames=0;
            }
        }
    }
}
