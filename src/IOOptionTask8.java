import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOptionTask8 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\AdmiN\\IOTask\\IOTask8Answer.txt");
        file.createNewFile();
        File file1 = new File("C:\\Users\\AdmiN\\IOTask\\src\\IOOptionTask2.java");
        ArrayList<String> ar = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (sc.hasNext()) {
                String word = sc.nextLine().replaceAll(" ","");
                String word1 = word.replaceAll("\\+", " + ");
                ar.add(word1.replaceAll("="," = "));
            }
            for (String s : ar) {
                System.out.println(s);
            }
        }
    }
}