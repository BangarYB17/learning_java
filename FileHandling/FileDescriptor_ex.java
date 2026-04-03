import java.io.*;
public class FileDescriptor_ex {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("output.txt");
        FileDescriptor fd = fos.getFD();
        System.out.println("Valid FD: "+fd.valid());
        fos.write("Hello".getBytes());
        fos.close();
    }
}
