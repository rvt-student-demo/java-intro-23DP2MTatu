package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedWriter writer = 
        Helper.getWriter("data.csv", StandardOpenOption.APPEND);

        writer.write("" + new Random().nextInt(100));
        writer.newLine();
        writer.close();
    }    
}