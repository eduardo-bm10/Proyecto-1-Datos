package display;

import characters.Player;
import characters.Enemy;

public class GameScreen
{
    public static void main(String[] args)
    {
        Display ventana = new Display();

        Player jugador = new Player(3);

        ventana.add(jugador);
    }
}
