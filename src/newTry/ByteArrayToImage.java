package newTry;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.File;

public class ByteArrayToImage extends PdftoZpl {
    public static void main(String[] args) {
        byte[] imageByteArray = null; // Replace with your byte array
        try {
            imageByteArray = getImageByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            // Step 1: Convert byte array to ByteArrayInputStream
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageByteArray);

            // Step 2: Convert ByteArrayInputStream to BufferedImage
            BufferedImage image = ImageIO.read(byteArrayInputStream);

            if (image != null) {
                System.out.println("Image successfully created from byte array!");

                // Optionally, save the image to a file
                ImageIO.write(image, "PNG", new File("output.png"));
            } else {
                System.out.println("Error: Could not read image from byte array.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Example method to simulate obtaining the byte array (replace with actual byte array)
    private static byte[] getImageByteArray() throws IOException {
        String filePath = "C:\\Users\\BZF26\\Downloads\\S634240042260_XS.pdf";
       return convertPDFToByteArray(filePath);
    }
}
