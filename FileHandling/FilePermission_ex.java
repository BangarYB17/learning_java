import java.io.FilePermission;
public class FilePermission_ex {
    public static void main(String[] args) {
        FilePermission permission = new FilePermission("output.txt", "read");
        System.out.println("File: "+permission.getName());
        System.out.println("Actions: "+permission.getActions());
    }
}
