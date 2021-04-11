package characters;

import list.types.CircularLinkedList;

import java.awt.*;

public class Boss extends Enemy
{
    Image boss = Toolkit.getDefaultToolkit().getImage("images/ufo.png");

    public Boss(int vidasJefe)
    {
        super(vidasJefe);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(boss, posx, posy, null);
    }

    public void muerteJefeHileraA(){
        super.muerteEnemigo();
        //Destruye al resto de enemigos comunes
    }

    public void alternatePositionInB(CircularLinkedList list)
    {

    }

    public void muerteJefeHileraC()
    {
        super.muerteEnemigo();
        //Otro enemigo comun se convierte en el jefe
    }
}
