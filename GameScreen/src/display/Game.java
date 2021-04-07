package display;

import characters.Player;

public class Game
{
    public static void main(String[] args)
    {
        Display ventana = new Display();
        ventana.add(new Player().imagen);
    }
}
