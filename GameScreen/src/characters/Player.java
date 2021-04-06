package characters;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Player extends MouseAdapter
{
    public BufferedImage playerTexture;
    int positionX;
    int positionY;
    int vidasJugador = 3;

    public Player(int positionX, int positionY, BufferedImage playerTexture)
    {
        this.positionX = positionX;
        this.positionY = positionY;
        this.playerTexture = playerTexture;

    }

    static class Movement extends MouseAdapter
    {
        public int x;
        public int y;

        @Override
        public void mouseMoved(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            x += dx;
            y += dy;
        }
    }
}

