import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileIO_ex {
    public static void main(String[] args) {
        try {
            // writing into file
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String message = "java file I/O Example";
            fos.write(message.getBytes());
            fos.close();
            System.out.println("Data written successfullt.");

            // writing into file
            FileInputStream fis =new FileInputStream("demo.txt");
            int data;
            System.out.print("File Content: ");
            while((data = fis.read())!= -1){
                System.out.print((char)data);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("Exception handled:"+e.getMessage());
        }
    }
}
