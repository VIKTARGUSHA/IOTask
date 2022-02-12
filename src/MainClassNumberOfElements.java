import java.io.File;
import java.util.ArrayList;

public class MainClassNumberOfElements {
    public static void main(String[] args) {
        System.out.println(args.length);
        File file = new File(args[0]);
        File[] filesList = file.listFiles();
        String[] fileAverageLenth = file.list();
        ArrayList <File> fileIsDirectory = new ArrayList<>();
        ArrayList <File> fileIsDoc = new ArrayList<>();
        double numberFilesInTheDirectory = 0;
        double averageAmountFilesInTheDirectory = 0.0;
        double totalLenthOfFile = 0.0;
        double averageLenthOfFile = 0.0;
        for (File anyFile : filesList){
            if (anyFile.isDirectory()) {
                fileIsDirectory.add(anyFile);
            }
            if(anyFile.isFile()) {
                fileIsDoc.add(anyFile);
            }
        }
        for (File av : fileIsDirectory){
            numberFilesInTheDirectory += av.listFiles().length;
            averageAmountFilesInTheDirectory = numberFilesInTheDirectory/fileIsDirectory.size();
        }
        for(String str : fileAverageLenth){
            totalLenthOfFile += str.length();
            averageLenthOfFile = totalLenthOfFile/fileAverageLenth.length;
        }
        System.out.printf("Average length of files :" + "   " + "%.2f", averageLenthOfFile );
        System.out.println("\nAmount of Directory :" + "   " + fileIsDirectory.size());
        System.out.println("Amount of File :" + "   " + fileIsDoc.size());
        System.out.printf("Average amount files in the directory :" + "   " + "%.2f", averageAmountFilesInTheDirectory);
    }
}
