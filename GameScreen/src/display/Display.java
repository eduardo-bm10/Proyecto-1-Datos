package display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import characters.Player;
import list.types.*;
import characters.Enemy;
import objectsImages.ImageLoader;
import puntos.PuntosSystem;
import shooting.PlayerMissile;

/**
 * Clase Display provee la ventana e interfaz en la que se ejecuta la aplicación.
 * Hereda de la clase JFrame
 *
 * @author Melissa Oviedo
 * @version 5.0
 * @see javax.swing.JFrame
 */
public class Display extends JFrame
{
    private final int WIDTH = 800, HEIGHT = 600;
    BufferedImage cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    Cursor blank = Toolkit.getDefaultToolkit().createCustomCursor(cursor, new Point(0,0), "blank cursor");
    public static JPanel panel = new JPanel();
    /**
     * El constructor de la clase Display.
     * Asigna las características esenciales de la ventana.
     * Ejecuta el método para añadir al jugador a la pantalla.
     * Ejecuta el método para añadir el contador de puntos a la pantalla.
     *
     * @author Melissa Oviedo, Eduardo Bolívar
     */
    public Display()
    {
        setTitle("Space Invaders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage("images/player.png"));
        setLayout(null);
        getContentPane().setCursor(blank);
        add(panel);
        panel.setSize(WIDTH, HEIGHT);
        panel.setVisible(true);
        panel.setBackground(Color.DARK_GRAY);
        addPlayerToScreen();
        addPointScreen();
        addRow();
    }

    /**
     * Instancia un objeto Player y lo agrega a la ventana.
     * Realiza un update luego de agregar el objeto para que aparezca en pantalla.
     *
     * @author Eduardo Bolívar
     * @see characters.Player
     */
    public void addPlayerToScreen()
    {
        Player player = new Player();
        panel.add(player);
        panel.updateUI();
    }

    public static boolean onScreen = false;
    public void addRow() {
        BasicRow hilera1 = new BasicRow();
        ClassA hilera2 = new ClassA();
        int i = 0;
        while (i < 100 && !onScreen)
        {
            if (i%2==0) {
                hilera1.createBasicRow();
                onScreen = true;
            }
            else {
                hilera2.createClassA();
                onScreen = true;
            }
            i++;
        }
    }

    public void addPointScreen()
    {
        PuntosSystem puntos= new PuntosSystem();
        panel.add(puntos);
    }
}
