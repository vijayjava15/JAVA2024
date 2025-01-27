package newTry;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

public class PdftoZpl {


    public static void main(String[] args) {


        String filePath = "C:\\Users\\BZF26\\Downloads\\S634240042260_XS.pdf"; // Replace with the path to your PDF file

        try {
            // Convert PDF file to byte array
            byte[] pdfBytes = convertPDFToByteArray(filePath);
            System.out.println("PDF successfully converted to byte array of length: " + pdfBytes.length);
            System.out.println( Base64.getEncoder().encodeToString(pdfBytes));
        } catch (IOException e) {
            System.err.println("Error reading the PDF file: " + e.getMessage());
        }
    }

    public static byte[] convertPDFToByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            return byteArray;
        }
    }
}

