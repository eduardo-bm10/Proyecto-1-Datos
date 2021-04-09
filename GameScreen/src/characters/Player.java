package characters;

import shooting.PlayerMissile;
import display.Display;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class Player extends JPanel
{
    public Rectangle2D.Float jugador = new Rectangle2D.Float(350, 400, 50, 70);
    Movement movimiento = new Movement();
    PlayerMissile disparo;

    public Player()
    {
        addMouseMotionListener(movimiento);
        addMouseListener(movimiento);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.darkGray);
        g2D.fill(jugador);
    }

    public class Movement extends MouseAdapter
    {
        public int x;
        public int y;

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            if (jugador.getBounds2D().contains(x, y))
            {
                jugador.x += dx;
                jugador.y += dy;
                repaint();
            }
            else{
                jugador.x = e.getX() - 40;
                jugador.y = e.getY() - 50;
            }
            x += dx;
            y += dy;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            disparo = new PlayerMissile(jugador.x - 40, jugador.y - 50);

            disparo.setDoubleBuffered(true);
            Display.window.add(disparo);

            disparo.movimientoDisparo();

            System.out.println("SI");
        }
    }
}

