package characters;

import java.awt.*;

public class Boss extends Enemy
{
    public Boss(int vidasJefe)
    {
        super(vidasJefe);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public void muerteJefeHileraA(){
        super.muerteEnemigo();
        //Destruye al resto de enemigos comunes
    }

    public void alternatePositionInB()
    {

    }

    public void muerteJefeHileraC()
    {
        super.muerteEnemigo();
        //Otro enemigo comun se convierte en el jefe
    }
}
