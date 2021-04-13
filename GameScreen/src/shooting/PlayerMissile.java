package shooting;


import display.Display;
import java.awt.*;
import javax.swing.*;

public class PlayerMissile implements Runnable
{
    public boolean running;
    private int x;
    private int y;

    Image shootImg = Toolkit.getDefaultToolkit().createImage("images/laserBlue01.png");
    public JLabel shoot = new JLabel(new ImageIcon(shootImg));


    public PlayerMissile(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        if (running)
        {
            movimientoDisparo();
        }
    }

    public void movimientoDisparo()
    {
        final int velocity = 10;
        while (y >= 0)
        {
            y -= velocity;
            shoot.setLocation(this.x, this.y);
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
