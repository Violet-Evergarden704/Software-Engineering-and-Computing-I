import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
//add:zhang,zhang,67890
//show:
//del:Ling
//done
public class Sample07_CSVFile {
    public static void main(String[] args){
        ArrayList<String> list = readCSV("salary.csv");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static ArrayList<String> readCSV(String filename){
        ArrayList<String> a = new ArrayList<String>();

        try{
            File myFile = new File(filename);
            FileReader fileReader = null;
            fileReader = new FileReader((myFile));
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while((line=reader.readLine())!=null){
                a.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  a;

    }
}
