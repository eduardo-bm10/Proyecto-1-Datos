package shooting;


import display.Display;
import java.awt.*;
import javax.swing.JPanel;

public class PlayerMissile extends JPanel
{
    private int x;
    private int y;

    Image shootImg = Toolkit.getDefaultToolkit().createImage("images/laserBlue01.png");

    public PlayerMissile(int x, int y)
    {
        this.x = x;
        this.y = y;

        System.out.println("Constructor Disparo");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(shootImg, x, y, null);

        System.out.println("paint");
    }

    public void movimientoDisparo()
    {
        final int velocity = 10;

        while (y >= 0)
        {
            y -= velocity;
            repaint();
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                System.err.println("Interrupted exception ocurred");
            }
        }
    }
}
