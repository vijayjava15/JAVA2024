package corejavaprojects.jsonparser;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JsonParser {

    public static void main(String[] args) throws IOException {

      //  File file = new File("C:\\Users\\BZF26\\Downloads\\S634240042260_XS.pdf");
        //file.read
        FileReader fileReader = new FileReader("C:\\\\Users\\\\BZF26\\\\Downloads\\\\S634240042260_XS.pdf");
        //int read = fileReader.read();

      String json =   Json.getSimpleJson0();

     // ObjectMapp
    }
}
