import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOptionTask10 {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter
                (new FileWriter
                        ("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\IOOptionTaskAns10.txt"));
             Scanner sc = new Scanner(new FileReader("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\src\\IOOptionTask5.java"))) {

            while (sc.hasNext()) {
                ArrayList<String> ar = new ArrayList<>();
                String strBeforeReplace = sc.nextLine();
               // System.out.print(strBeforeReplace.length());
                switch (strBeforeReplace.length()) {
                    case 0:
                        continue;
                    case 1:
                        ;
                }
                String[] wordsArBefore = strBeforeReplace.split(" ");
                String strAfterReplace = strBeforeReplace.replaceAll("[^a-zA-z .*;]", "");
                String[] wordsAr = strAfterReplace.split(" ");
//
                switch (wordsAr.length) {
                    case 0:
                        continue;
                }
                String first = wordsAr[0];
                String last = wordsAr[wordsAr.length - 1];
              //  System.out.println(first + " " + last );
                wordsAr[0] = last;
                wordsAr[wordsAr.length - 1] = first;
//
                int ind = 0;
                for (int i = 0; i < wordsArBefore.length-1; i++) {
                    System.out.println(wordsArBefore[i] + " " + first);
                    if (wordsArBefore[i].equals(first)) {
                        wordsArBefore[i] = last;
                        ind = i;
                        break;
                    }
                }

                for (int i = wordsAr.length - 1; i >= 0; i--) {
                    if (wordsArBefore[i].equals(last) && i != ind) {
                        wordsArBefore[i] = first;
                        break;
                    }
                }
                for (String st : wordsArBefore) {
                    bufferedWriter.write(st + " ");
                }
                bufferedWriter.write("\n");
            }
        }
    }
}