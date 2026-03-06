public class cache{
    public static void main(String[] args) {
        /* cache range -128 to 127  */
        Integer a =100;
        Integer b =100;
        
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Integer c =100;
        Integer d =100;
        
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}