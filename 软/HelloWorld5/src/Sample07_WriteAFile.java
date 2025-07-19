import java.io.FileWriter;
import java.io.IOException;

public class Sample07_WriteAFile {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter(("Foo.txt"))){
            writer.write("hello world");
            writer.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}