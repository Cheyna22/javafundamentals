import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * go find the image
 * read the image
 * mess with the image
 * save/output the new image
 */
public class Bitmap {

    public Path path;
    public BufferedImage imageData;

    public Bitmap(Path imagePath) {
        // actually read in file and save that data in an instance variable
        this.path = imagePath;
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(String.valueOf(imagePath.toFile())));
            this.imageData = img;
        } catch (IOException e) {

        }
    }

    public void flipVertically() {
        // logic on instance variable to flip img
        // take each row
        // reverse it(flip it)
        for(int i = 0; i < this.imageData.getHeight(); i++) {
            for(int j = 0; j < this.imageData.getWidth() / 2; j++) {
                int temp = this.imageData.getRGB(i, j);
                this.imageData.setRGB(i, j, this.imageData.getRGB(i, this.imageData.getWidth() - j - 1));
                this.imageData.setRGB(i, this.imageData.getWidth() - j - 1, temp);
            }
        }

    }

    public boolean save(Path savePath) {
        // output instance variable data into a file at the same time
        try {
            return ImageIO.write(imageData, "bmp", savePath.toFile());
        } catch (IOException e){

        }


        return false;
    }


}
