import java.io.*;
import java.util.ArrayList;

public class IOOptionTask5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("studentsList.txt"));
        String empty = bufferedReader.readLine();
        String student = bufferedReader.readLine();
        StringReader stringReader = new StringReader(student);
        char[] arStud = new char[98];
        stringReader.read(arStud, 0, 98);
        System.out.println(arStud);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("studentList.txt"));
        StringWriter stringWriter = new StringWriter();
        ArrayList<Character> arScoresStudent = new ArrayList<>();
//        for (char anyCharArStud : arStud){
//            if(anyCharArStud == 1 || anyCharArStud == 2 || anyCharArStud == 3 )
//        }
        stringWriter.write(arStud);
        String [] stuAr = student.split(" ");
        bufferedWriter.write(stringWriter.toString());
        bufferedReader.close();
        bufferedWriter.close();

    }
}
