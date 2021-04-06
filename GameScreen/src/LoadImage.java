import java.awt.*;
import javax.swing.JFrame;

public class LoadImage extends Canvas {
    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:/Users/KimO/Escritorio/Proyecto-1-Datos/spaceing.png");
        g.drawImage(i, 120,100,this);

    }
    public static void main(String[] args) {
        LoadImage m=new LoadImage();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
    }




}
