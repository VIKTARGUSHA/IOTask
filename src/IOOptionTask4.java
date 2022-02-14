import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class IOOptionTask4 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\AdmiN\\IOTask\\src\\ProgrammAfterChange.java"))) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IOOptionalTaskFour"));
            ArrayList<String[]> ar = new ArrayList<>();
              bufferedReader.read();
              int a;
            while ((a = bufferedReader.read()) != -1) {
                String s = (String.valueOf(a) + bufferedReader.readLine());
                String[] arStr = s.split(" ");

                for (String str : arStr) {
                    if (str.contains("//")) {
                        str.replace("//", "// ");
                    }
                    if (str.length() > 2) {
                        str.toLowerCase(Locale.ROOT);
                    }

                }
                ar.add(arStr);
                System.out.println(arStr.length + " " + s);
            }
            bufferedReader.close();
            bufferedWriter.write(ar.toString());
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}