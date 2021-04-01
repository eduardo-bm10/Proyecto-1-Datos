package display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import characters.Player;

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

        Canvas background1 = new Canvas();
        background1.setSize(WIDTH, HEIGHT);
        background1.setBackground(Color.black);
        add(background1);
    }
}
