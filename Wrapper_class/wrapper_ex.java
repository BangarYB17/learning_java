public class wrapper_ex {
public static void main(String[] args) {
    int primitive =10;
    Integer wrapper = Integer.valueOf(primitive);
    System.out.println(primitive);
    System.out.println(wrapper);

    String num = "100";

    int value = Integer.parseInt(num);
    System.out.println(value);
}    
}
