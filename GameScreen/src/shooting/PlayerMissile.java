package shooting;

import javax.swing.*;

import display.Display;
import objectsImages.ImageLoader;



/**
 * Clase PlayerMissile
 * Permite que las municiones de la nave aparezcan en pantalla
 *
 * @author Eduardo Bolívar
 * @version 1.01
 *
 *@see characters.Player
 *
 */

public class PlayerMissile extends JLabel implements Runnable
{
    private final int x;
    private int y;

    /**
     * Metodo PlayerMissile
     *Permite cargar la imagen del misile que usa la nave
     * Posee los parametros de las coordenadas (x,y) de la nave
     * @param x
     * @param y
     *
     * @author Eduardo Bolívar
     * @version 1.0
     * @see PlayerMissile
     */

    public PlayerMissile(int x, int y)
    {
        super(ImageLoader.loadImage("images/laserBlue01.png"));
        this.x = x;
        this.y = y;
    }

    /**
     * Método shootMovement
     * Permite hacer que la munición de la nave se mueva
     * @author Eduardo Bolívar
     * @version 1.1
     *
     * @see PlayerMissile
     */

    public void shootMovement()
    {
        while (y >= 0)
        {
            if (y <= 0) {
                Display.panel.remove(this);
                Display.panel.updateUI();
            }

            y -= 10;
            setLocation(x, y);
            try
            {
                Thread.sleep(15);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método run
     * Permite al metodo shootMovement pueda correr
     *
     * @author Eduardo Bolívar
     * @version 1.1 deluxe
     *
     * @see PlayerMissile
     */
    @Override
    public void run() {
        shootMovement();
    }
}
