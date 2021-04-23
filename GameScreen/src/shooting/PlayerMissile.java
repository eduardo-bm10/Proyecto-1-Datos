package shooting;

import javax.swing.*;
import characters.Enemy;
import display.Display;
import list.types.BasicRow;
import objectsImages.ImageLoader;
import pruebas.Colision;
import puntos.PuntosSystem;

public class PlayerMissile extends JLabel implements Runnable
{
    private int x;
    private int y;

    public PlayerMissile(int x, int y)
    {
        super(ImageLoader.loadImage("images/laserBlue01.png"));
        this.x = x;
        this.y = y;
    }

    public void shootMovement()
    {
        while (y >= 0)
        {
            for (int i = 0; i < 7; i++) {
                if (Colision.checkCollision(BasicRow.hilera.get(i), this))
                {
                    new PuntosSystem().addingPoints();
                }
            }
            if (y <= 0) {
                Display.panel.remove(this);
                Display.panel.updateUI();
            }
            y -= 10;
            setLocation(x, y);
            try
            {
                Thread.sleep(15);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        shootMovement();
    }
}
