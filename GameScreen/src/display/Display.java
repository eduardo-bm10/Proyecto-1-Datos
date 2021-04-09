package display;

import javax.swing.JFrame;
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

    public Display(){
        window.setTitle("Space Invaders");
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Player jugador = new Player();
        window.add(jugador);

        Enemy enemigo = new Enemy(30,50);
        window.add(enemigo);
        enemigo.movimientoEnemigo();
    }
}
