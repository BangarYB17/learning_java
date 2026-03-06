public class enhanced_for_loop{
    public static void main(String[] args) {
       int num[] = new int[5];
       num[0] = 1;
       num[1] = 2;
       num[2] = 3;
       num[3] = 4;
       num[4] = 5;
    

       /* Enhanced For Loop (for each loop) */
       for(int arr:num){
        System.out.println(num); // print memory locations of elements.
        System.out.println(arr); // print arr data.
       }

    }
}

