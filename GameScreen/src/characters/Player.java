package characters;

import shooting.PlayerMissile;
import display.Display;
import objectsImages.ImageLoader;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase Player genera un objeto jugador a partir de la clase JLabel.
 *
 * @author Eduardo Bolívar
 * @version 3.0
 *
 * @see javax.swing.JLabel
 */
public class Player extends JLabel
{
    private int posx = 400;
    private final int posy = 500;

    Movement movimiento = new Movement();

    /**
     * Constructor de la clase Player.
     * Reutiliza el constructor de JLabel por medio de "super" para añadir un ImageIcon.
     * Llama al método addMouseMotionListener y addMouseListener para agregar la clase Movement.
     *
     * @author Eduardo Bolívar
     */
    public Player()
    {
        super(ImageLoader.loadImage("images/player.png"));
        Display.panel.addMouseMotionListener(movimiento);
        Display.panel.addMouseListener(movimiento);
    }

    /**
     * Clase Movement provee los métodos para mover al objeto Player por medio del mouse.
     * Hereda los métodos de la clase MouseAdapter.
     *
     * @author Eduardo Bolívar
     * @version 2.0
     *
     * @see java.awt.event.MouseAdapter
     */
    public class Movement extends MouseAdapter
    {
        public int x;

        /**
         * Método que permite mover al objeto Jugador por medio del mouse.
         * Se obtiene realizando Overriding a la clase MouseAdapter.
         *
         * @author Java
         * @param e permite acceder a los métodos de la clase MouseEvent.
         *
         * @see java.awt.event.MouseEvent
         */
        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;

            if (e.getComponent().contains(posx, posy))
            {
                posx += dx;
                setLocation(posx, posy);
            }
            else{
                posx = e.getX() - 40;
            }
            x += dx;
        }

        /**
         * Método que permite generar un objeto PlayerMissile por medio del click.
         * Se obtiene realizando Overriding a la clase MouseAdapter.
         *
         * @author Java
         * @param e permite acceder a los métodos de la clase MouseEvent.
         *
         * @see java.awt.event.MouseEvent
         * @see shooting.PlayerMissile
         */
        @Override
        public void mouseClicked(MouseEvent e)
        {
            PlayerMissile laser = new PlayerMissile(posx, posy);

            Thread runLaser = new Thread(laser);
            runLaser.start();
            Display.panel.add(laser);
            Display.panel.updateUI();
        }
    }
}

