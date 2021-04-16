package characters;

import shooting.PlayerMissile;
import display.Display;
import objectsImages.ImageLoader;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Player extends JLabel
{
    private int posx = 400;
    private final int posy = 500;

    Movement movimiento = new Movement();

    public Player()
    {
        super(ImageLoader.loadImage("images/player.png"));
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
                setLocation(posx, posy);
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

            Thread runLaser = new Thread(laser);
            runLaser.start();
            Display.panel.add(laser);
            Display.panel.updateUI();
        }
    }
}

