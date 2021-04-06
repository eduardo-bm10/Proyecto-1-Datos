package pruebas;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Missile extends Resize
{
    BindMouseMove coord = new BindMouseMove();

    private final Ellipse2D.Float myMissil;

    public Missile()
    {
        myMissil = new Ellipse2D.Float(myRect.x - coord.x, myRect.y - coord.y, 10, 40);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.orange);
        g2D.fill(myMissil);
    }

    public void movement()
    {
        myMissil.y -= 5;
        repaint();
        System.out.println("This also works");
    }
}
