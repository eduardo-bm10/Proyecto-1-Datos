package display;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

import characters.Player;
import characters.Enemy;

public class Display extends JFrame {

    private final int WIDTH = 900, HEIGHT = 600;

    private final int FPS =60;
    private double TARGETTIME;
    private double delta =0;
    private int AVERAGE_FPS = FPS;

    public static JFrame window = new JFrame();
    JPanel color = new JPanel();

    public Display(){
        color.setBackground(Color.GREEN);
        window.add(color);
        window.setTitle("Space Invaders");
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        addPlayerToScreen();
    }

    public void addEnemyRowToScreen(int listType)
    {
        if (listType == 1)
        {

        }
        else if (listType == 2)
        {

        }
    }

    public void addPlayerToScreen()
    {
        Player jugador = new Player();
        window.add(jugador);
    }
}
