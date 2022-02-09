import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file.txt");
        File file = new File(args[0]);
        File[] arr = file.listFiles();
        for (File fileName : arr) {
            if (fileName.isDirectory()) {
                for (File anyFile : fileName.listFiles()) {
                    fileWriter.write( anyFile.toString() + "\n");
                   // fileWriter.write("/n LLLLLLL");
                }
            }
                   // if (fileName.isFile()) {
                   //    fileWriter.write(fileName.getName());
                 //      fileWriter.write("/n");
                  //  }
                   // System.out.println(args[0]);
                }
        //System.out.println(arr.length);
        fileWriter.close();
    }
}