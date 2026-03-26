import java.io.FileOutputStream;
import java.io.IOException;

public class Append_ex{
      public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("demo.txt",true);

            String text = "\nThis line is appended.";

            // byte[] data = text.getBytes();
            // fos.write(data);
            fos.write(text.getBytes());
            fos.close(); 

            System.out.println("Data appended Successfully.");
        }
        catch(IOException e){
            System.out.println("Exception Handled:"+e.getMessage());
        }
      }
}
