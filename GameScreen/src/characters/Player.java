package characters;

import images.ImageLoader;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Player extends JPanel
{
    public ImageLoader imagen = new ImageLoader(350, 400);
    Movement movimiento = new Movement();

    public Player()
    {
        addMouseMotionListener(movimiento);
        addMouseListener(movimiento);
    }

    class Movement extends MouseAdapter
    {
        public int x;
        public int y;

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            if (imagen.contains(x, y))
            {
                imagen.posicionX += dx;
                imagen.posicionY += dy;
                imagen.repaint();
            }
            x += dx;
            y += dy;
        }
    }
}

