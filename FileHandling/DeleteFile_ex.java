import java.io.File;

public class DeleteFile_ex {
    public static void main(String[] args) {
       File file = new File("demo.txt");
       if(file.exists()){
          if(file.delete()){
            System.out.println("Deleted Successfully.");
          }else{
            System.out.println("unble to delete.");
          }
       }else{
        System.out.println("File not found.");
       }
    }
}
