import java.io.File;
import java.io.IOException;

public class CreateFile_ex {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            if (file.createNewFile()) {
                System.out.println("File Created successfully: "+file.getName());
            }else{
                System.out.println("file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the file.");
            e.printStackTrace();
        }
    }
}
