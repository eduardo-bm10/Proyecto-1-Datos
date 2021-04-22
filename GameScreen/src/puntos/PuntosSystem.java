package puntos;

import javax.swing.*;
import java.awt.*;


/**
* Clase PuntosSystemn
* Genera el texto para poder ver los puntos en la pantalla
* @author Kevin Lobo Juárez
* @version 1.01
*
* @see PuntosSystem
*/

public class PuntosSystem extends JLabel {
    public int score = 0;
    public int colision = 0;
    //Sería necesario poder agregar las coordenadas de los enemigos y jugador
    //public int balaX, balaY;
    //public int enemyX,enemyY;


    /**
     * Metodo PuntosSystem
     * Genera el texto con JLabel
     * @author Kevin Lobo Juarez
     * @see PuntosSystem
     */
    public PuntosSystem(){
        JLabel texto = new JLabel();
        texto.setText("Puntos:" + score);
        texto.setBounds(40,50,100,200);
        texto.setForeground(Color.ORANGE);
        System.out.println("Texto en la pantalla");

        addingPoints();

    }

    /**
     * Método addingPoints
     * Actua como detector de colisiones
     * Agrega puntos cada que se detecte la collision
     * @author Kevin Lobo Juarez
     * @see PuntosSystem
     */

    public void addingPoints() {
        //la situacion de colision se genera aqui
        if (colision != 0){
            score += 100;
            System.out.println("+100 puntos al jugador");
        }else{
            System.out.println("No se sumó nada");
        }
    }
}
