package pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class Resize extends JPanel
{
    protected Rectangle2D.Float myRect = new Rectangle2D.Float(100, 200, 100, 50);
    BindMouseMove movingAdapt = new BindMouseMove();


    public Resize()
    {
        addMouseMotionListener(movingAdapt);
        addMouseListener(movingAdapt);
    }

    public Missile createMissil()
    {
        return new Missile();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(new Color(0, 0, 200));
        g2D.fill(myRect);
    }

    class BindMouseMove extends MouseAdapter {
        public int x;
        public int y;

        @Override
        public void mouseClicked(MouseEvent e)
        {
            Missile shot = createMissil();
            shot.movement();
            System.out.println("This works");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            if (myRect.getBounds2D().contains(x, y)) {
                myRect.x += dx;
                myRect.y += dy;
                repaint();
                limit();
            }
            else {
                myRect.x = e.getX() - 50;
                myRect.y = e.getY() - 25;
                System.out.println("Fix this");
            }
            x += dx;
            y += dy;
        }

        public void limit()
        {
            if (myRect.y <= 400)
            {
                myRect.y = 400;
            }
        }
    }

    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("Moving and Scaling");
        Resize resi = new Resize();
        resi.setDoubleBuffered(true);
        jFrame.add(resi);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
