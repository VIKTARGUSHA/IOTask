import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class IOOptionTask5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("studentsList.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("studentList.txt"));
        ArrayList<Character> arScoresStudent = new ArrayList<>();
        while (bufferedReader.read() != -1) {
            String empty = bufferedReader.readLine();
            String student = bufferedReader.readLine();
            String[] studentForAverageScore = student.split(" ");
            double avScore = 0;
            int counterItems = 0;
            if (!studentForAverageScore[studentForAverageScore.length - 1].equals("None")){
                counterItems +=1;
                avScore += Double.parseDouble(studentForAverageScore[studentForAverageScore.length-1]);
        }
            if (!studentForAverageScore[studentForAverageScore.length - 2].equals("None")){
                counterItems +=1;
                avScore += Double.parseDouble(studentForAverageScore[studentForAverageScore.length-2]);
            }
            if (!studentForAverageScore[studentForAverageScore.length - 3].equals("None")){
                counterItems +=1;
                avScore += Double.parseDouble(studentForAverageScore[studentForAverageScore.length-3]);
            }
            double averageScore = avScore/counterItems;
            if (averageScore > 7){
                studentForAverageScore[2] = studentForAverageScore[3].toUpperCase();
            }
            String studentWithUpper = Arrays.toString(studentForAverageScore);
            StringReader stringReader = new StringReader(studentWithUpper);
            char[] arStud = new char[studentWithUpper.length()];
            stringReader.read(arStud, 0, studentWithUpper.length());

            StringWriter stringWriter = new StringWriter();
            stringWriter.write(arStud);
            String[] stuAr = student.split(" ");
            System.out.println(Arrays.toString(stuAr));
            bufferedWriter.write(stringWriter.getBuffer() + "\n");
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
