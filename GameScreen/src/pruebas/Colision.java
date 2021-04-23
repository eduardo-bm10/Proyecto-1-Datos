package pruebas;

import characters.*;
import shooting.PlayerMissile;

import javax.swing.*;
import java.awt.*;

public class Colision
{
    public Colision(JLabel obj1, JLabel obj2)
    {
        Rectangle r = obj1.getBounds();
        if (r.intersects(obj2.getBounds()))
        {
            System.out.println("Colisiono");
        }
    }
}
