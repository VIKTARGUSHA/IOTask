import java.io.*;
import java.util.ArrayList;

public class MainTaskSecondPart {
    public static void main(String[] args) throws IOException {
       // System.out.println(args.length);
        FileReader fileReader = new FileReader(args[0]);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            ArrayList<String> ar = new ArrayList<>();
            int str;
            while ((str = bufferedReader.read()) != -1) {
                ar.add((char) str + bufferedReader.readLine());
            }
            for (String sr : ar) {
                System.out.println(sr);
            }
        }
    }
}