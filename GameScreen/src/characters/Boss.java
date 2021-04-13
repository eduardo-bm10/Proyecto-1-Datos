package characters;

import list.types.CircularLinkedList;

import java.awt.*;

public class Boss extends Enemy
{
    public String aqui = "Jefe";

    Image boss = Toolkit.getDefaultToolkit().getImage("images/ufo.png");

    public Boss(int vidasJefe)
    {
        super(vidasJefe);
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
