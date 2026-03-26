import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Write data into memory using ByteArrayOutputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            String message = "Hello Java IO";

            baos.write(message.getBytes());

            // Convert written data into byte array
            byte[] data = baos.toByteArray();

            // Step 2: Read same data from memory using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(data);

            int ch;
            while ((ch = bais.read()) != -1) {
                System.out.print((char) ch);
            }

            baos.close();
            bais.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}