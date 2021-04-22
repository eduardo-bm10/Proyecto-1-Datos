package puntos;

import javax.swing.*;
import java.awt.*;


public class PuntosSystem extends JLabel {
    public int score = 0;
    public int colision = 0;
    //Sería necesario poder agregar las coordenadas de los enemigos y jugador
    //public int balaX, balaY;
    //public int enemyX,enemyY;

    public PuntosSystem(){
        JLabel texto = new JLabel();
        texto.setText("Puntos:" + score);
        texto.setBounds(40,50,100,200);
        texto.setForeground(Color.ORANGE);
        System.out.println("Texto en la pantalla");

        addingPoints();

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
