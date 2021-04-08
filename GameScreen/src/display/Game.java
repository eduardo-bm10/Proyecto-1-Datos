package display;

import characters.Player;
import characters.Enemy;

public class Game
{
    public static Display ventana;

    public static void main(String[] args)
    {
        ventana = new Display();

        Player jugador = new Player();

        jugador.setDoubleBuffered(true);
        ventana.add(jugador);
    }
}
