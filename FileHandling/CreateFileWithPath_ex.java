import java.io.File;
import java.io.IOException;

public class CreateFileWithPath_ex {
    public static void main(String[] args) {
       
        try {
            File file = new File("C:\\Users\\Admin\\Documents\\filehandling\\demo.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: "+file.getAbsolutePath());
            }else{
                System.out.println("file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the file.");
            e.printStackTrace();
        }
    }
}

