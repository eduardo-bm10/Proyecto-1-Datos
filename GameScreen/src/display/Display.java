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

    public static JFrame window = new JFrame();

    BufferedImage cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    Cursor blank = Toolkit.getDefaultToolkit().createCustomCursor(cursor, new Point(0,0), "blank cursor");

    public Display(){
        window.setTitle("Space Invaders");
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        window.getContentPane().setCursor(blank);

        addPlayerToScreen();
    }

    public void addPlayerToScreen()
    {
        Player jugador = new Player();
        //Enemy prueba = new Enemy(1);

        //window.add(prueba);
        window.add(jugador);

        //prueba.movimientoEnemigo();
    }
}
