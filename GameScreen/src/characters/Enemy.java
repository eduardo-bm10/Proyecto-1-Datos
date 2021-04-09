package characters;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Enemy extends JPanel
{
    int normalWidth;
    int normalHeight;

    public Rectangle2D.Float enemigo = new Rectangle2D.Float(10, 10, normalWidth, normalHeight);

    public Enemy(int normalWidth, int normalHeight)
    {
        this.normalWidth = normalWidth;
        this.normalHeight = normalHeight;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.orange);
        g2D.fill(enemigo);
    }

    public void movimientoEnemigo()
    {
        while (enemigo.x < 800 & enemigo.y < 400) {
            enemigo.x += 5;
            enemigo.y += 5;
            repaint();
            try {Thread.sleep(10); } catch (InterruptedException e) { System.err.print("Algo salio mal"); }
        }
    }

    public void muerteEnemigo()
    {
        //El enemigo desaparece
    }
}
