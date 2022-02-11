import java.io.*;
import java.util.ArrayList;

public class SecondMainTask {
    public static void main(String[] args) throws IOException {
        //System.out.println(args.length);
        FileWriter fileWriter = new FileWriter("text1.txt");

        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            File file = new File(args[0]);
            File isFile;
            String[] list1 = file.list();
            File[] files = file.listFiles();
            ArrayList<String> ar = new ArrayList<>();
            for (File str : files) {
                ar.add(str.getPath());
            }
            System.out.println(file.exists());
            int counterAr = 0;
            for (String stringFile : list1) {
                //printWriter.write(stringFile + "\n");
                printWriter.println("--------" + stringFile);
                isFile = !stringFile.contains(".") ? new File(ar.get(counterAr)) : null;
                counterAr += 1;
                if (isFile != null){
                    for(File fileInSide : isFile.listFiles()){
                        printWriter.println(fileInSide.getName());
                    }
                }
            }
            System.out.println(list1.length);
        }
    }
}