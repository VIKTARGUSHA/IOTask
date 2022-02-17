import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class IOOptionTask4 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\AdmiN\\IOTask\\src\\ProgrammAfterChange.java"))) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IOOptionalTaskFour"));
            ArrayList<ArrayList<String>> ar = new ArrayList<>();
              int a;
            while ((a = bufferedReader.read()) != -1) {
                String s = ((char) a + bufferedReader.readLine());
                String[] arStr = s.split(" ");
                ArrayList<String> arEventually = new ArrayList<>();
                for (String str : arStr) {
                       String strWithout = str.replace("//", "");
                    if (strWithout.length() > 2) {
                        String strUp = strWithout.toUpperCase();
                        arEventually.add(strUp);
                    }
                   else {
                        arEventually.add(strWithout);
                    }

                }
                ar.add(arEventually);
                System.out.println(ar.get(ar.size()-1));
            }
            bufferedReader.close();

            for (ArrayList <String> stri : ar) {
                int c = 0;
                for (String sr : stri) {
                    if (c == 0){
                    bufferedWriter.write("//" + sr + " ");
                }
                    else {
                        bufferedWriter.write(sr + " ");
                    }
                    c +=1;
                }

                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}