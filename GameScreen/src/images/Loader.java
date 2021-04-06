package images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Loader
{
    public static BufferedImage ImageLoader(String path)
    {
        try
        {
            return ImageIO.read(Loader.class.getResource(path));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.err.print("Error en carga de imagen");
        }
        return null;
    }
}
