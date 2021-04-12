package characters;

import shooting.PlayerMissile;
import display.Display;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Player extends JPanel
{
    private int posx = 400;
    private final int posy = 500;

    Movement movimiento = new Movement();

    Image playerImage = Toolkit.getDefaultToolkit().getImage("images/player.png");

    public Player()
    {
        addMouseMotionListener(movimiento);
        addMouseListener(movimiento);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(playerImage, posx, posy, null);
    }

    public class Movement extends MouseAdapter
    {
        public int x;

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;

            if (e.getComponent().contains(posx, posy))
            {
                posx += dx;
                repaint();
            }
            else{
                posx = e.getX() - 40;
            }
            x += dx;
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            PlayerMissile laser = new PlayerMissile(posx, posy);

            laser.running = true;

            Thread t = new Thread(laser);
            t.start();

            System.out.println("Click");

            Display.window.add(laser, BorderLayout.NORTH);
        }
    }
}

