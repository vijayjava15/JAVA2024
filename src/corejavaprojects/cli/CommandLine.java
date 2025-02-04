package corejavaprojects.cli;

import java.io.*;

public class CommandLine {

    public static void main(String[] args) throws IOException {

        //this is implementation now done only for windows

        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start");
       Process process =  processBuilder.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));



    }
}
