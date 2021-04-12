package shooting;


import display.Display;
import java.awt.*;
import javax.swing.JPanel;

public class PlayerMissile extends JPanel implements Runnable
{
    public boolean running;
    private int x;
    private int y;

    Image shootImg = Toolkit.getDefaultToolkit().createImage("images/laserBlue01.png");

    public PlayerMissile(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(shootImg, x, y, null);
    }

    @Override
    public void run()
    {
        if (running)
        {
            System.out.println("running");
            movimientoDisparo();
        }
        else {
            System.out.println("not running");
        }
    }

    public void movimientoDisparo()
    {
        final int velocity = 10;
        while (y >= 0)
        {
            y -= velocity;
            repaint();
            System.out.println("GG");
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
}
