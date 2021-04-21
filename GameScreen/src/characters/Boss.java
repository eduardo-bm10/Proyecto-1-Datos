package characters;

import list.types.CircularLinkedList;
import objectsImages.ImageLoader;
import javax.swing.JLabel;
import java.awt.*;

public class Boss extends Enemy
{
    int bossLives;

    public Boss(int bossLives)
    {
        super(ImageLoader.loadImage("images/ufo.png"));
        this.bossLives = bossLives;
    }


}
