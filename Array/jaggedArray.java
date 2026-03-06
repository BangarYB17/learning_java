public class jaggedArray{
    public static void main(String[] args) {
       int matrix[][] = new int[3][];

       matrix[0] = new int[3];
       matrix[1] = new int[2];
       matrix[2] = new int[3];

         matrix[0][0] = 1;
         matrix[0][1] = 2;
         matrix[0][2] = 3;

         matrix[1][0] = 4;
         matrix[1][1] = 5;

         matrix[2][0] = 6;
         matrix[2][1] = 7;
         matrix[2][2] = 8;
       
       
       
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
       }
    }
}

