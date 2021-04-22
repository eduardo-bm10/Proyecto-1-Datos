package objectsImages;

import javax.swing.*;
import java.awt.*;

public class ImageLoader
{
    public static ImageIcon loadImage(String path)
    {
        Image img = Toolkit.getDefaultToolkit().getImage(path);

        return new ImageIcon(img);
    }
}
