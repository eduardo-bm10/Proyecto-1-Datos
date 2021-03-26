import javax.swing.*;

public class Display extends JFrame {

    private final int WIDTH = 800, HEIGHT = 600;

    private final int FPS =60;
    private double TARGETTIME;
    private double delta =0;
    private int AVERAGE_FPS = FPS;


    public Display(){
        setTitle("Space Invaders");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
