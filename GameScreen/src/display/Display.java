package display;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import characters.Player;
import list.types.Row;

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

    public void addRowsToScreen(int type)
    {
        Row row = new Row();

        if (type == 1)
            row.createBasic();
        else if (type == 2)
            row.createClassA();
        else if (type == 3)
            row.createClassB();
        else if (type == 4)
            row.createClassC();
        else if (type == 5)
            row.createClassD();
        else
            row.createClassE();

    }
    public void addPlayerToScreen()
    {
        Player jugador = new Player();
        window.add(jugador);
    }
}
