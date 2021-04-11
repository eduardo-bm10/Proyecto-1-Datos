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
    private int posy = 400;

    Movement movimiento = new Movement();

    Image playerImage = Toolkit.getDefaultToolkit().getImage("images/player.png");

    public Player()
    {
        addMouseMotionListener(movimiento);
        addMouseListener(movimiento);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(playerImage, posx, posy, null);
    }

    public class Movement extends MouseAdapter
    {
        public int x;
        public int y;

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            if (e.getComponent().contains(posx, posy))
            {
                posx += dx;
                posy += dy;
                repaint();
            }
            else{
                posx = e.getX() - 40;
                posy = e.getY() - 50;
            }
            x += dx;
            y += dy;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            PlayerMissile laser = new PlayerMissile(posx, posy);

            Display.window.add(laser);
        }
    }
}

