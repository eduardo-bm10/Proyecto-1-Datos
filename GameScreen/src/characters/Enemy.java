package characters;

import display.Display;
import objectsImages.ImageLoader;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Clase Enemy genera un objeto a partir de la clase JLabel.
 * Implementa la interfaz Runnable para ejecutar el método movimientoEnemigo por medio de la clase Thread.
 * Declara variables boolean RIGHT y LEFT para condicionar el movimiento.
 *
 * @author Eduardo Bolívar
 * @version 4.0
 *
 * @see javax.swing.JLabel
 * @see java.lang.Runnable
 */
public class Enemy extends JLabel implements Runnable
{
    private static boolean RIGHT = true;
    private static boolean LEFT = false;

    int lives;
    protected int posx = 0;
    protected int posy = 30;

    /**
     * El primer constructor Enemy asigna un objeto ImageIcon.
     * Asigna el número de vidas del enemigo.
     *
     * @author Eduardo Bolívar
     * @param lives es el número de vidas ingresadas para el enemigo.
     *
     * @see javax.swing.ImageIcon
     */
    public Enemy(int lives)
    {
        super(ImageLoader.loadImage("images/med2.png"));
        this.lives = lives;
    }

    /**
     * El segundo constructor sólo es usado por la clase Boss.
     * Asigna la imagen del objeto Boss por medio de un objeto ImageIcon.
     *
     * @author Eduardo Bolívar
     * @param img es la imagen cargada que se utiliza para el objeto Boss.
     *
     * @see characters.Boss
     * @see javax.swing.ImageIcon
     */
    protected Enemy(ImageIcon img)
    {
        super(img);
    }

    /**
     * Permite el movimiento del objeto Enemy por medio de la modificación de sus coordenadas.
     * El movimiento se realizará mientras el objeto esté por encima de y=600.
     * El movimiento es hacia la derecha hasta llegar al borde de la pantalla
     * El movimiento es hacia la izquierda hasta llegar al borde de la pantalla.
     * El movimiento se condiciona por medio de las variables boolean RIGHT y LEFT.
     * Se utiliza un Thread.sleep para darle cierta velocidad al movimiento.
     *
     * @author Eduardo Bolívar
     *
     * @see java.lang.Thread
     */
    public void movimientoEnemigo()
    {
        while (posy <= 600)
        {
            while (posx < 750 && RIGHT) {
                posx += 10;
                setLocation(posx, posy);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.print("Algo salio mal");
                }
                if (posx >= 750) {
                    RIGHT = false;
                    LEFT = true;
                }
            }
            posy += 30;

            while (posx > 0 && LEFT) {
                posx -= 10;
                setLocation(posx, posy);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.print("Algo salio mal");
                }
                if (posx <= 0) {
                    LEFT = false;
                    RIGHT = true;
                }
            }
            posy += 30;

            if (posy >= 500){
                Display.panel.remove(this);
                Display.panel.updateUI();
            }
        }
    }

    @Override
    public void run() {
        movimientoEnemigo();
    }
}
