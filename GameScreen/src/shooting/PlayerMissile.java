package shooting;

import javax.swing.*;

import display.Display;
import objectsImages.ImageLoader;

public class PlayerMissile extends JLabel implements Runnable
{
    private final int x;
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
