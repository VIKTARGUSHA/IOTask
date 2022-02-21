import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class IOOptionTask6 {
    public static void main(String[] args) throws IOException {

        File file = new File("optionTaskSix.txt");
        file.createNewFile();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    //        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("OptionTaskSixAnswer.txt"))){
//            bufferedWriter.append(args[0].replace("," , "") +" d").append(" \n").append("int i").append(" \n").append(args[1] + " " + "s").append(" \n").
//        append("char c").append("\n").append("long l").append("\n");
//            bufferedWriter.append("String str").write("\n");
//           bufferedWriter.write("short sh");
//           bufferedWriter.append("\n");
//           bufferedWriter.append("double d");
            String s;
            while ((s = bufferedReader.readLine()) != null){
                bufferedWriter1.write(s);
            String[] arAmountSplit = s.split(" ");
                ArrayList<String> arStringFromCommandRow = new ArrayList<>();
            for (String str : arAmountSplit){
                arStringFromCommandRow.add(str);
            }
            if (arStringFromCommandRow.contains(args[0].replace("," , "")) || arStringFromCommandRow.contains(args[1])){
                bufferedWriter1.write("  oops this type from command raw :" + arStringFromCommandRow.get(arStringFromCommandRow.size()-2) );
            }
            bufferedWriter1.write("\n");
            }
        }
//        File file1 = new File("OptionTaskSixAnswer");
//        System.out.println(file1.exists());
//        file1.delete();
    }
}
