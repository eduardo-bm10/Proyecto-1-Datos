package puntos;

import display.Display;
import pruebas.Colision;

import javax.swing.*;
import java.awt.*;

/**
 * Clase PuntosSystem crea un objeto contador de puntos a partir de JLabel.
 * Detecta la colisión de un objeto PlayerMissile contra un objeto Enemy.
 * Instancia la variable "score" para mostrarla en pantalla.
 *
 * @author Kevin Lobo
 */
public class PuntosSystem extends JLabel {
    private static int score = 0;

    public PuntosSystem()
    {
        setText("Puntos:" + score);
        setBounds(40,50,100,200);
        setLocation(700, 20);
        setForeground(Color.ORANGE);
    }

    public void addingPoints()
    {
        score += 100;
        this.setText("Puntos:" + score);
    }
}
