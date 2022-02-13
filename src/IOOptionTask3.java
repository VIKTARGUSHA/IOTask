import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IOOptionTask3 {
    public static void main(String[] args) throws IOException {
        File fileOne = new File("C:\\Users\\AdmiN\\IOTask\\src", "ProgrammAfterChange.java");
        FileReader fileReader = new FileReader(fileOne);
        ArrayList<ArrayList<Character>> arRow = new ArrayList<>();
        try {
          //  System.out.println(fileOne.exists());
            Scanner sc = new Scanner(fileReader);
            ArrayList<char[]> arL = new ArrayList<>();

            while (sc.hasNext()) {
                arL.add(sc.nextLine().toCharArray());
            }
            for (char[] charAr : arL) {
                ArrayList<Character> arCh = new ArrayList<>();
                for (int i = 0; i < charAr.length; i++) {
                    arCh.add(charAr[i]);
                   // arRow.add(arCh);
                }
                Collections.reverse(arCh);
                arRow.add(arCh);

                String strS = arRow.get(arRow.size() - 1).toString().replaceAll(", ", "");
                String strSec = strS.replaceAll("\\[", "  ");
                String strThird = strSec.replaceAll("\\]", "  ");
                String strFour = strThird.replaceAll("//", "  ");
                System.out.println(arRow.size() + strFour);
            }
        }catch (IllegalAccessError exc){}
        finally{
            try {
                if (fileOne.exists()){
                    fileReader.close();
                }
//        file.mkdir();
//        file.delete();}
            }catch (FileNotFoundException ex){}
        }
        FileWriter fileWriter = new FileWriter("ProgrammAfterChange");
        for (ArrayList<Character>ar : arRow){

            String strAfterOne = ar.toString().replaceAll(", ", "");
            String strAfterTwo = strAfterOne.replaceAll("\\[", "  ");
            String strAfterThird = strAfterTwo.replaceAll("\\]", "  ");
            String strFour = strAfterThird.replaceAll("//", "  ");
            fileWriter.write( strFour + "\n");

        }
        fileWriter.close();
    }
}
