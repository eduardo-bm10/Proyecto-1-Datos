package objectsImages;

import javax.swing.*;
import java.awt.*;


/**
 * Class ImageLoader
 * Permite cargar las imagenes
 * @author Kevin Lobo Juárez
 * @see Eduardo Bolívar
 * @version 1.0
 */
public class ImageLoader
{

    /**
     * metodo loadImage
     * Permite con la biblioteca de java.awt cargar la imagen que se necesite
     * @author Eduardo Bolívar
     * @version 1.1
     * @see ImageLoader
     * @see display
     * @param path
     * @return img
     */
    public static ImageIcon loadImage(String path)
    {
        Image img = Toolkit.getDefaultToolkit().getImage(path);

        return new ImageIcon(img);
    }
}
