import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOptionTask2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\AdmiN\\IOTask\\src\\ProgrammBeforeChange.java");
        FileReader fileReader = new FileReader(file);
        Scanner sc = new Scanner(fileReader);
        ArrayList<String> ar = new ArrayList<>();
        while (sc.hasNext()) {
            String str =sc.nextLine().replace("public", "private");
            String str1 = str.replace("Before", "After");
            ar.add(str1);
        }
        fileReader.close();
       // System.out.println(ar.size());
        FileWriter fileWriter = new FileWriter("C:\\Users\\AdmiN\\IOTask\\src\\ProgrammAfterChange.java");
        for (String str : ar) {
            fileWriter.write(str + "\n");
        }
        fileWriter.close();
    }
}