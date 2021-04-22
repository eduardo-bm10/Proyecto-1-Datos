package characters;

import display.Display;
import objectsImages.ImageLoader;
import javax.swing.*;

public class Enemy extends JLabel implements Runnable
{
    private static boolean RIGHT = true;
    private static boolean LEFT = false;

    int lives;
    protected int posx = 0;
    protected int posy = 30;

    public Enemy(int lives)
    {
        super(ImageLoader.loadImage("images/med2.png"));
        this.lives = lives;
    }

    protected Enemy(ImageIcon img)
    {
        super(img);
    }

    public void movimientoEnemigo()
    {
        while (posy <= 600)
        {
            while (posx < 750 && RIGHT) {
                posx += 10;
                setLocation(posx, posy);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.print("Algo salio mal");
                }
                if (posx >= 750) {
                    RIGHT = false;
                    LEFT = true;
                }
            }
            posy += 30;

            while (posx > 0 && LEFT) {
                posx -= 10;
                setLocation(posx, posy);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.print("Algo salio mal");
                }
                if (posx <= 0) {
                    LEFT = false;
                    RIGHT = true;
                }
            }
            posy += 30;

            if (posy >= 500){
                Display.panel.remove(this);
                Display.panel.updateUI();
            }
        }
    }

    @Override
    public void run() {
        movimientoEnemigo();
    }
}
