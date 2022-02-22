import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOptionTask8 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\IOTask8Answer.txt");
        file.createNewFile();
        File file1 = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\src\\IOOptionTask2.java");
        ArrayList<String> ar = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (sc.hasNext()) {
                String word = sc.nextLine();
                ar.add(word.replaceAll("\t, \n, \s, \r",""));
            }
            System.out.println(ar);
        }
    }
}