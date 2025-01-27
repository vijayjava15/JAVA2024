package bank;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

public class ZplExample {


    public static void main(String[] args) {
        String filePath = "C:\\Users\\BZF26\\Downloads\\springboot3\\output_page_1.png";

        try {
            // Encode the file content to Base64
            String base64String = encodeFileToBase64(filePath);

            // Print the Base64 encoded string


            // Create the ZPL command to print the Base64-encoded image
            String zplCommand = "^XA^FO100,100^GB200,200,200^FS^FO100,100^BQN,2,10^FD"
                    + base64String + "^FS^XZ";
            String commands = "^XA\n\r^MNM\n\r^FO050,50\n\r^B8N,100,Y,N\n\r^FD1234567\n\r^FS\n\r^PQ3\n\r^XZ";
            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
            Doc doc = new SimpleDoc(commands.getBytes(), flavor, null);

            System.out.print(zplCommand);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }


    public static String encodeFileToBase64(String filePath) throws IOException {
        // Read the file content into a byte array
        byte[] fileContent = Files.readAllBytes(Paths.get(filePath));


        // Encode the byte array to a Base64 string
        String base64Encoded = Base64.getEncoder().encodeToString(fileContent);

        return base64Encoded;
    }

    }

