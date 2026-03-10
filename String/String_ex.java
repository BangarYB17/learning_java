public class String_ex{
    public static void main(String[]args){
       String name1 = "Yogeshwar";
       String name2 = "Yogeshwar";
       System.out.println(name1);
       System.out.println(name1 == name2); //true (value stored in a constant pull)

       String lname1 = new String("Jayesh nagya");
       String lname2 = new String("Jayesh nagya");
       System.out.println(lname1);
       System.out.println(lname1 == lname2); //false (values stored in heap memory on different location)
       System.out.println(lname1.equals(lname2));  // true (it compares or checks value not memory location)

       String str = "Yogeshwar";
       str = str.concat(" Java Developer"); // concat function (combine two strings)
       System.out.println(str);   // updated value (Yogeshwar Java Developer)

       // 1. length()
       System.out.println("1.Length of str: "+str.length()); // 24

       // 2. toLowerCase()
       System.out.println("2.convert str into lowercase: "+str.toLowerCase());

       // 3. toLowerCase()
       System.out.println("3.convert str into uppercase: "+str.toUpperCase());

       // 4.trim()
       System.out.println("4.remove spaces : "+str.trim()); // remove space from string starting and ending point. 

       //5.substring()
       System.out.println("5.substring from 3 index: "+str.substring(6)); // str.substring(startIndex,endingIndex)

       // 6.replace()
       System.out.println("6.Replace character: "+str.replace('a','r'));

      // 7.startwith()
       System.out.println("7.string start with yog: "+str.startsWith("Yog"));

      // 8.startwith()
       System.out.println("8.string end with per: "+str.endsWith("r"));

      // 9.charAt()
       System.out.println("9.return char using index: "+str.charAt(8));

      // 10.indexOf()
       System.out.println("10.return char using index: "+str.indexOf('r'));

      // 11.parseInt()  (converts string into integer)
        String abc = "123";
        int num = Integer.parseInt(abc);
        System.out.println(num + 10);

    // 11 contains()
      System.out.println("11. string contains Y: "+ str.contains("Y"));
    }
}