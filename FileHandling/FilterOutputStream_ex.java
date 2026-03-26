import java.io.FileOutputStream;
import java.io.FilterOutputStream;
public class FilterOutputStream_ex {
    public static void main(String[] args) {
        try {
            FileOutputStream fos= new FileOutputStream("demo.txt");
            FilterOutputStream fout = new FilterOutputStream(fos);

                fout.write('A');
                String data = "hello java";
                fout.write(data.getBytes());
                fout.close();
                System.out.println("Data Written.");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
