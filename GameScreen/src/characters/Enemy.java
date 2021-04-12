package characters;

import javax.swing.*;
import java.awt.*;

public class Enemy extends JPanel
{
    public String aqui = "Enemigo";
    private static boolean RIGHT = true;
    private static boolean LEFT = false;

    int lives;
    protected int posx = 10;
    protected int posy = 10;

    Image enemyImage = Toolkit.getDefaultToolkit().getImage("images/med2.png");

    public Enemy(int lives)
    {
        this.lives = lives;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(enemyImage, posx, posy, null);
    }

    public void movimientoEnemigo()
    {
        while (posx < 800 & RIGHT)
        {
            posx += 15;
            posy += 1;
            repaint();
            try {Thread.sleep(50); } catch (InterruptedException e) { System.err.print("Algo salio mal"); }

            if (posx >= 800)
            {
                RIGHT = false;
                LEFT = true;
            }
        }
        while (posx > 0 & LEFT)
        {
            posx -= 15;
            posy += 1;
            repaint();
            try {Thread.sleep(50); } catch (InterruptedException e) { System.err.print("Algo salio mal"); }
            if (posx <= 0)
            {
                LEFT = false;
                RIGHT = true;
            }
        }
    }

    public void muerteEnemigo()
    {
        //El enemigo desaparece
    }
}
