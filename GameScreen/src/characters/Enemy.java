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
        g2D.setColor(Color.darkGray);
        g2D.fill(enemigo);
    }

    public void movimientoEnemigo()
    {
        if (enemigo.x <= 800)
        {
            enemigo.x += 5;
            repaint();
        }
        else{
            enemigo.x -= 5;
            repaint();
        }
        enemigo.y += 10;
    }
    public void muerteEnemigo()
    {
        //El enemigo desaparece
    }
}
