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
        try {
            File[] arr = file.listFiles();
            for (File fileName : arr) {
                if (fileName.isDirectory()) {
                    fileWriter.write(fileName.getName() + "\n");
                    for (File anyFile : fileName.listFiles()) {
                        fileWriter.write("    -" + anyFile.getName() + " \n");
                    }
                }
                if (fileName.isFile()) {
                    fileWriter.write("Is file : ");
                    fileWriter.write(fileName.getName() + "\n");
                }
            }
        } catch (IOException ex) {
        } finally {
            if (file.exists()) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                }
            }
            //fileWriter.close();
        }
    }
}