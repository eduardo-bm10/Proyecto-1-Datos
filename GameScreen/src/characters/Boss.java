package characters;

import objectsImages.ImageLoader;
import javax.swing.JLabel;
import java.awt.*;

public class Boss extends Enemy
{
    int bossLives;
    int posx = super.posx;
    int posy = super.posy;

    public Boss(int bossLives)
    {
        super(ImageLoader.loadImage("images/ufo.png"));
        this.bossLives = bossLives;
    }

    @Override
    public void movimientoEnemigo()
    {
        super.movimientoEnemigo();
    }
}
