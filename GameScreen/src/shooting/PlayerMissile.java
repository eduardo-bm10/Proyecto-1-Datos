package shooting;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class PlayerMissile extends JPanel
{
    int velocidadDisparo = 10;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.lightGray);
        g.fillRect(50, 60, 30, 40);
    }

    public void movimientoDisparo()
    {

    }
}
