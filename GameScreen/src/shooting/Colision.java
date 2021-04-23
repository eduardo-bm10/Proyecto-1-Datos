package shooting;

import display.Display;
import javax.swing.*;
import java.awt.*;

/**
 * Clase Colision provee los métodos que verifican el choque entre dos objetos en pantalla.
 * Provee un método estático para que sea fácilmente accesible en cualquier otra clase.
 *
 * @author Alessandro Hidalgo, Javier Tenorio
 * @version 1.5
 *
 * @see java.awt.Rectangle
 */
public class Colision
{
    /**
     * Verifica si hubo colisión entre dos objetos de tipo JLabel.
     * Registra el tamaño de cada objeto en forma de rectángulo por medio de la clase Rectangle.
     * Si hubo colisión, además, elimina el objeto 1 de la pantalla.
     *
     * @author Alessandro Hidalgo, Javier Tenorio
     * @param obj1 es el objeto que recibe el impacto del segundo objeto.
     * @param obj2 es el objeto que impacta al primer objeto.
     * @return boolean
     *
     * @see javax.swing.JLabel
     * @see java.awt.Rectangle
     */
    public static boolean checkCollision(JLabel obj1, JLabel obj2)
    {
        Rectangle r1 = obj1.getBounds();
        Rectangle r2 = obj2.getBounds();
        if (r1.intersects(r2))
        {
            Display.panel.remove(obj1);
            return true;
        }
        else{
            return false;
        }
    }
}
