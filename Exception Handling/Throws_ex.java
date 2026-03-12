import java.io.*;
public class Throws_ex {
    public static void readFile() throws IOException{
        FileReader file =new FileReader("abc.txt");
    }
    public static void main(String[] args) throws IOException{
       readFile(); 
    }
}
