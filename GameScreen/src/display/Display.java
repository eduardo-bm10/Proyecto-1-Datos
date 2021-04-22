package display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import characters.Player;
import list.types.*;
import characters.Enemy;
import objectsImages.ImageLoader;
import shooting.PlayerMissile;

public class Display extends JFrame{

    private final int WIDTH = 800, HEIGHT = 600;

    BufferedImage cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    Cursor blank = Toolkit.getDefaultToolkit().createCustomCursor(cursor, new Point(0,0), "blank cursor");

    public static JPanel panel = new JPanel();

    public Display() {
        JFrame window = new JFrame();

        window.setTitle("Space Invaders");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIDTH,HEIGHT);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
        window.setIconImage(Toolkit.getDefaultToolkit().getImage("images/player.png"));

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
        Player player = new Player();
        panel.add(player);
        panel.updateUI();
    }
}
