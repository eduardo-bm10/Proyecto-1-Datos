package display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import characters.Player;
import list.types.Row;
import characters.Enemy;

public class Display extends JFrame {

    private final int WIDTH = 900, HEIGHT = 600;


    private final int FPS =60;
    private double TARGETTIME;
    private double delta =0;
    private int AVERAGE_FPS = FPS;

    BufferedImage cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    Cursor blank = Toolkit.getDefaultToolkit().createCustomCursor(cursor, new Point(0,0), "blank cursor");

    public static JPanel panel = new JPanel();

    public Display(){
        JFrame window = new JFrame();

        window.setTitle("Space Invaders");
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        window.setLayout(null);

        window.getContentPane().setCursor(blank);

        window.add(panel);

        panel.setSize(WIDTH, HEIGHT);
        panel.setVisible(true);
        panel.setBackground(Color.DARK_GRAY);

        addPlayerToScreen();
    }

    public void addPlayerToScreen()
    {
        Player jugador = new Player();
        Enemy prueba = new Enemy(1);

        panel.add(jugador.player);
        panel.add(prueba.enemigo);

        prueba.movimientoEnemigo();
    }
}
