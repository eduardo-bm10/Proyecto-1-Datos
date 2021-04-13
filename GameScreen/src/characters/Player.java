package characters;

import shooting.PlayerMissile;
import display.Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Player
{
    private int posx = 400;
    private final int posy = 500;

    Movement movimiento = new Movement();

    Image img = Toolkit.getDefaultToolkit().getImage("images/player.png");
    public JLabel player = new JLabel(new ImageIcon(img));

    public Player()
    {
        player.setLocation(posx, posy);
        Display.panel.addMouseMotionListener(movimiento);
        Display.panel.addMouseListener(movimiento);
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
                player.setLocation(posx, posy);
            }
            else{
                posx = e.getX() - 40;
                player.setLocation(posx, posy);
            }
            x += dx;
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            PlayerMissile laser = new PlayerMissile(posx, posy);

            laser.running = true;

            Display.panel.add(laser.shoot);

            Thread t = new Thread(laser);
            t.start();

            System.out.println("Click");
        }
    }
}

