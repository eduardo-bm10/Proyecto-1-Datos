import java.awt.*;
import javax.swing.JFrame;

public class loadImage extends Canvas{

    public void paint(Graphics g) {
        move( );

        int x = 0;
        int y;

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("spaceing.png");
        g.drawImage(i, x , y,this);

    }

    public void move(int x, int y){

        int xNave = x;
        int yNave = y;
    }

    public static void main(String[] args) {
        loadImage m=new loadImage();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(800,600);
        f.setVisible(true);
        f.setResizable(false);
    }


}

