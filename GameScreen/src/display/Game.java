package display;

import characters.Player;
import characters.Enemy;

public class Game
{
    public static void main(String[] args)
    {
        Display ventana = new Display();

        Player jugador = new Player();
        jugador.setDoubleBuffered(true);
        ventana.add(jugador);

    }
}
