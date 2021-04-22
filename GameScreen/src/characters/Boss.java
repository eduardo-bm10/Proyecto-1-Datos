package characters;

import objectsImages.ImageLoader;
import javax.swing.JLabel;
import java.awt.*;

/**
 * Clase Boss genera un objeto enemigo jefe a partir de la clase Enemy.
 * La clase Enemy, a su vez hereda de JLabel.
 * Presenta instancias para el número de vidas y la posición de las coordenadas.
 *
 * @author Eduardo Bolívar
 * @version 3.0
 *
 * @see characters.Enemy
 * @see javax.swing.JLabel
 */
public class Boss extends Enemy
{
    int bossLives;
    int posx = super.posx;
    int posy = super.posy;

    /**
     * El constructor de la clase Boss añade al JLabel un objeto ImageIcon.
     * Asigna la cantidad de vidas a la instancia bossLives.
     *
     * @author Eduardo Bolívar
     * @param bossLives es la cantidad de vidas ingresada para el objeto Boss.
     *
     * @see javax.swing.ImageIcon
     */
    public Boss(int bossLives)
    {
        super(ImageLoader.loadImage("images/ufo.png"));
        this.bossLives = bossLives;
    }

    /**
     * Realiza el movimiento del enemigo jefe a partir del método movimientoEnemigo de la clase Enemy.
     * Modifica las coordenadas X y Y de tal forma que el enemigo se mueva a la derecha e izquierda, y hacia abajo.
     *
     * @author Eduardo Bolívar
     *
     * @see characters.Enemy
     */
    @Override
    public void movimientoEnemigo()
    {
        super.movimientoEnemigo();
    }
}
