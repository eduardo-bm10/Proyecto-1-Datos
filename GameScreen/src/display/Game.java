package display;

import characters.Player;
import characters.Enemy;
import images.Loader;


public class Game
{
    public static void main(String[] args)
    {
        Display ventana = new Display();
        new Player(400, 500, Loader.ImageLoader("C:\\Users\\Eduardo\\Documents\\GitHub\\Proyecto-1-Datos\\GameScreen\\images\\player.png"));
    }
}
