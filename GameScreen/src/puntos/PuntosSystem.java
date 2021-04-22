package puntos;

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
    public int score = 0;
    public int colision = 0;
    //Sería necesario poder agregar las coordenadas de los enemigos y jugador
    //public int balaX, balaY;
    //public int enemyX,enemyY;

    public PuntosSystem()
    {
        setText("Puntos:" + score);
        setBounds(40,50,100,200);
        setLocation(700, 20);
        setForeground(Color.ORANGE);
        System.out.println("Texto en la pantalla");
    }

    public void addingPoints() {
        //la situacion de colision se genera aqui
        //if()
        if (colision != 0){
            score += 100;
            System.out.println("+100 puntos al jugador");
        }else{
            System.out.println("No se sumó nada");
        }
    }
}