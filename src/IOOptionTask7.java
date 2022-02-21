import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class IOOptionTask7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\IO\\IOTask7.txt");
        file.createNewFile();
        try (//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("IOTask7Answer.txt"))) {
           // bufferedWriter.write("Марыська чарнабрэва, галубка мая,\n" +
//                    "Гдзе ж ся падзела шчасце і ясна доля твая?\n" +
//                    "Усё прайшло,- прайшло, як бы не бывала,\n" +
//                    "Адна страшэнна горыч у грудзях застала.\n" +
//                    " \n" +
//                    "Калі за нашу праўду Бог нас стаў караці\n" +
//                    "Ды ў прадвечнага саду вялеў прападаці,\n" +
//                    "То мы прападзем марна, но праўды не кінем,\n" +
//                    "Хутчэй Неба і шчасце, як праўду, абмінем.\n" +
//                    " \n" +
//                    "Не наракай, Марыся, на сваю бяздолю,\n" +
//                    "Но прыймі цяжкую кару Прадвечнага волю,\n" +
//                    "А калі мяне ўспомніш, шчыра памаліся,\n" +
//                    "То я з таго свету табе адазвуся.\n" +
//                    " \n" +
//                    "Бывай здаровы, мужыцкі народзе,\n" +
//                    "Жыві ў шчасці, жыві ў свабодзе.\n" +
//                    "І часам спамяні пра Яську твайго,\n" +
//                    "Што згінуў за праўду для дабра твайго.\n" +
//                    "\n" +
//                    "А калі слова пяройдзе у дзела,\n" +
//                    "Тагды за праўду станавіся смела,\n" +
//                    "Бо адно з праўдай у грамадзе згодна\n" +
//                    "Дажджэш, Народзе, старасці свабодна.\n" +
//                    "\n" +
//                    "1864");
            int counter = 1;
            AbstractList<String> arRows = new ArrayList<>();
            String s;
            while ((s = bufferedReader.readLine()) != null ) {
                if (counter  == 1) {
                    arRows.add(s);
                  //  System.out.println(arRows.get(arRows.size() - 1));
                }
                if (counter % 5 != 0 && counter !=1) {
                    arRows.add(s);
                 //   System.out.println(arRows.get(arRows.size() - 1));
                }
                counter += 1;
            }

            for (String str : arRows) {
                String[] arForThisRow = str.split(" ");
                ArrayList <String> arAfterSplit = new ArrayList<>();
                arAfterSplit.addAll(Arrays.asList(arForThisRow));
                ArrayList<Integer> indexesForDel = new ArrayList<>();
           //    System.out.println(Arrays.toString(arForThisRow));
                int counterHonest = 0;

                for (String st : arAfterSplit) {
                    String string = st.replace("," , "");
                    if (string.length() >= 3 && string.length() < 5) {
                        counterHonest++;
                    }
                  // System.out.println(string);
                }
                System.out.println( counterHonest);
                if (counterHonest % 2 == 0) {
                    for (String streng : arAfterSplit) {
                        String strWithoutComma = streng.replace("," , "");
                        if (strWithoutComma.length() >= 3 && strWithoutComma.length() < 5) {
                            int indForDel = arAfterSplit.indexOf(streng);
                            indexesForDel.add(indForDel);
                        }
                    }
                    System.out.println(Arrays.toString(arForThisRow));
                }
                if (counterHonest % 2 == 1) {
                        for (String sCond : arAfterSplit) {
                            while (counterHonest > 1 ) {
                                String stringWithNoComma = sCond.replace("," , "");
                            if (stringWithNoComma.length() >= 3 && stringWithNoComma.length() < 5) {
                                int indForDel = arAfterSplit.indexOf(sCond);
                                indexesForDel.add(indForDel);
                                counterHonest--;
                            }
                        }
                    }
                }
                for(int strn : indexesForDel){
                    arAfterSplit.set(strn, "ThisElementWilleDeleted");
                }
                arAfterSplit.removeAll(indexesForDel);
                System.out.println(arAfterSplit.toString());
                bufferedWriter1.write(arAfterSplit.toString() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

