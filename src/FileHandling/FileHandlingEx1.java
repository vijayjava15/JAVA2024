package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileHandlingEx1 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\BZF26\\Downloads\\sssss.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter("C:\\Users\\BZF26\\Downloads\\sssss.txt");
        for (int i = 0; i < 1000 ; i++) {
            fileWriter.write(i*10);
        }

        FileReader fileReader = new FileReader("C:\\Users\\BZF26\\Downloads\\sssss.txt");
//xsxxx

//xxxxx
    }
}
