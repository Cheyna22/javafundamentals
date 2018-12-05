import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Bitmap {
    BufferedImage testImg;

    {
        try {
            testImg = ImageIO.read(getClass().getResource("bitmapTestImg.bmp"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(testImg);
        }
    }




//    public static void invertImg(){
//
//    }
//
//    public static void pixilateImg() {
//
//    }


}
