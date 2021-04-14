package shooting;

import javax.swing.*;
import objectsImages.ImageLoader;

public class PlayerMissile extends JLabel implements Runnable
{
    private final int x;
    private int y;

    public PlayerMissile(int x, int y)
    {
        super(ImageLoader.loadImage("images/laserBlue01.png"), JLabel.CENTER);
        this.x = x;
        this.y = y;
    }

    public void shootMovement()
    {
        while (y >= 0)
        {
            y -= 20;
            setLocation(x, y);
            try
            {
                Thread.sleep(10);
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
