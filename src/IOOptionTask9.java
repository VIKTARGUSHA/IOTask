import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOptionTask9 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\src\\IOOptionalTask1.java");
        try (Scanner sc = new Scanner(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IOOptionTask9.txt"))) {
            while (sc.hasNext()) {
                String row = sc.nextLine();
                System.out.println(row);
                if (!row.contains("//") && (!row.contains("/*"))) {
                    bufferedWriter.write(row + "\n");
                }
                if (row.contains("/*")){
                    while (sc.hasNext() && !(sc.nextLine().contains("*/"))){};
                    }
                }
            }
        }
    }
