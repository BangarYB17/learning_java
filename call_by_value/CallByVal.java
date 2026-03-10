public class CallByVal {
    public static void changeValue(int x){
        x=50;
        System.out.println("Printing x: "+x);
    }
    public static void main(String[] args) {
        int num = 10;
        changeValue(num);
        System.out.println("Printing num: "+num);
    }
}
