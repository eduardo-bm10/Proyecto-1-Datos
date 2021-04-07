package images;

import characters.Player;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ImageLoader extends JPanel
{
    public int posicionX;
    public int posicionY;

    public ImageLoader(int x, int y)
    {
        this.posicionX = x;
        this.posicionY = y;
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("GameScreen/images/player.png");
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(i, posicionX, posicionY, this);
    }
}

