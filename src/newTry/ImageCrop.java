package newTry;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterOp;
import java.io.File;
import java.io.IOException;

public class ImageCrop {

    public static void main(String[] args) throws IOException {


        File image = new File("C:\\Users\\BZF26\\Downloads\\S634240042260_XS.pdf");
        BufferedImage imageFile = ImageIO.read(image);

            // Create an instance of Rectangle class with desired size.
            Rectangle rectangle = new Rectangle(20, 20, 20, 20);

        int x = 50;  // starting x coordinate
        int y = 50;  // starting y coordinate
        int width = 200;  // width of the cropped area
        int height = 150;
        BufferedImage croppedImage = imageFile.getSubimage(x, y, width, height);

        // Save the cropped image
        File outputFile = new File("cropped_image.jpg");
        ImageIO.write(croppedImage, "jpg", outputFile);

        System.out.println("Image cropped successfully!");



    }
}
