package characters;

import shooting.PlayerMissile;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Player extends JPanel
{
    int vidasJugador;

    public Player(int vidasJugador)
    {
        this.vidasJugador = vidasJugador;
    }

    @Override
    public void paintComponents(Graphics g)
    {
        super.paintComponents(g);

        g.setColor(Color.BLUE);
        g.fillRect(30, 40, 50, 60);
    }

    public void movimientoDeLaNave() {
        //Aqui iria todo lo del movimiento del mouse
    }

    public PlayerMissile disparar() {
        return new PlayerMissile();
    }
}

