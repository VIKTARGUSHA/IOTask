import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IOOptionalTask1 {
    public static void main(String[] args) throws IOException{

         File fileIO = new File("C:\\Users\\AdmiN\\IOTask\\folder"); //"fileOneMore.txt");
         fileIO.mkdir();
         File fileIOTwo = new File(fileIO, "oneMoreFile");
         // fileIO.createNewFile();
         // fileIO.delete();
         FileWriter fileWriter = new FileWriter(fileIOTwo);
        try {
            fileWriter.write("\n");
         for (int x = 0; x < 20; x += 2) {
             fileWriter.write(String.valueOf((int)((Math.random() * 96) - 48)) + " ");
         }
     }
        catch (IOException ex) {}
     finally {
         if (fileIO.exists()){
            try {
                fileWriter.close();
            }catch (IOException ex){}
         }
     } FileReader fileReader = new FileReader(fileIOTwo);
        Scanner sc = new Scanner(fileReader);
        ArrayList<Integer> ar = new ArrayList<>();
        while (sc.hasNext()){
            ar.add(sc.nextInt());
        }
        Collections.sort(ar);
        System.out.println(ar.toString());
        FileWriter fileWriter1 = new FileWriter(fileIOTwo);
        fileWriter1.write(String.valueOf(ar));
        fileWriter1.close();
     }
    }

