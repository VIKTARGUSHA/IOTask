import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOpttionTask11 {
    public static void main(String[] args) throws IOException {
        int m = 4;
        int n = 8;
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\IOTask7.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter
                    (new FileWriter("IOOptionTaskAnswer11.txt"))){
            ArrayList<StringBuilder> ar = new ArrayList();
            int hasOrNot;
            while ((hasOrNot = bufferedReader.read()) != -1) {
                System.out.print(hasOrNot);
                StringBuilder s = new StringBuilder
                        (bufferedReader.readLine());
                if(s.length() > 0 ) {
                s.insert(0, (char) hasOrNot);
                ar.add(s);
                    System.out.println(s);
            }
            }

       //     ar.forEach(o -> System.out.println(o));
    }
}
}