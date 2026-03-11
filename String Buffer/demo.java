import java.util.StringTokenizer;

public class demo {
    public static void main(String[] args) {
        String str = "java Python c#";

        System.out.println(str);
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(5,11));
        System.out.println(str.substring(12,14));

        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String str1 = "java |Python |c#";
         StringTokenizer ts = new StringTokenizer(str1,"|");

        while(ts.hasMoreTokens()){
            System.out.println(ts.nextToken());
        }
    }
}
