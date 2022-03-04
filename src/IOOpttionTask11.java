import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOOpttionTask11 {
    public static void main(String[] args) throws IOException {
        int m = 2;
        int n = 8;
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\IOTask7.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter
                    (new FileWriter("IOOptionTaskAnswer11.txt"))){
            ArrayList<StringBuilder> ar = new ArrayList();
            int hasOrNot;

            while ((hasOrNot = bufferedReader.read()) != -1) {
                StringBuilder s = new StringBuilder (bufferedReader.readLine());
                if (s.length() > 0) {
                    s.insert(0, (char) hasOrNot);
                    ar.add(s);
                   // System.out.println(s);
                }
            }
            for (int i = ar.size()-1-n; i < ar.size(); i++ ){
                String [] arRestrictNumberOfWords = ar.get(i).toString().split(" ");
                if(arRestrictNumberOfWords.length > 3) {
                    ar.get(i).delete(0, ar.get(i).indexOf(arRestrictNumberOfWords
                            [arRestrictNumberOfWords.length - 1 - m]));
                }
                else {
                    ar.get(i).delete(0, ar.get(i).lastIndexOf
                            (arRestrictNumberOfWords[arRestrictNumberOfWords.length-1]));
                }
                System.out.println(ar.get(i));
            }



//            String str = "\n";
//         //   System.out.println(Integer.parseInt(str, 8));
//            System.out.println((int) str.charAt(0));
////            System.out.println((char) (65 +1));
////            System.out.println(String.valueOf(11));
//                for (StringBuilder string : ar){
//                  //  if ((int) string.toString().charAt(0) != 10) {
//                        String[] arAfterSplit = string.toString().split(" ");
//                        String first = arAfterSplit[0];
//                        String last = arAfterSplit[arAfterSplit.length - 1];
//                   // System.out.println(first + " " + last);
//                    if((int) string.toString().charAt(0) != 10) {
//                        string.insert(0, last + " ");
//                        //     System.out.println(string);
//                        //   s.insert(arAfterSplit.length-1, first);
//                        string.append(" ").append(first);
//                        string.delete(last.length() + 1, last.length() + 1 + first.length() + 1);
//                        string.delete(string.indexOf(first) - last.length() - 1, string.indexOf(first) - 1);
//                    }
//                    System.out.println(string);
//                    }
                }

            }

       //     ar.forEach(o -> System.out.println(o));
    }

