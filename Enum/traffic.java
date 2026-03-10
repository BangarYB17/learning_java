enum signal{
    red,
    green,
    yellow
}
public class traffic {
    public static void main(String[] args) {
        signal traffic = signal.red;
        switch(traffic){
            case red:
                System.out.println("red signal it is ,You Should stop");
                break;
            case green:
                System.out.println("green signal it is ,You can go");
                break;
            case yellow:
                System.out.println("yellow signal it is  ");
                break;
        }
    }
}
