package shooting;


import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class PlayerMissile extends JPanel
{
    public float x;
    public float y;
    int velocidadDisparo = 10;

    public final Rectangle2D.Float disparo = new Rectangle2D.Float(x, y, 30, 60);

    public PlayerMissile(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.lightGray);
        g2D.fill(disparo);
    }

    public void movimientoDisparo()
    {
        while (disparo.y >= 0)
        {
            disparo.y -= velocidadDisparo;
            repaint();

            System.out.println("Movimiento");
        }
    }
}
