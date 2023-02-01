import java.util.Arrays;

public class h {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66,},
                {30, 40, 20, 10, 25},
        };

        /*System.out.println(Arrays.toString(matrix[2]));
        System.out.println(matrix[1][1]);
        for (int i=0;i<matrix.length;i++){
            System.out.println(matrix[1][i]);
        }*/

       /* for (int i = 0; i < matrix.length; i++) {
            for (int h = 0; h < matrix [i].length; h++) {
                if (matrix[i][h] %2!=0){
                System.out.print(matrix[i][h]+" ");


                  }
            }
            System.out.println();

        }*/


   /*for (int[] e:matrix){
       for (int g:e){
           System.out.print(g+" ");






       }
       System.out.println();
   }*/

for (int i=1;i<=4;i++){
    for (int j =0;j<i;j++){
        System.out.print("* ");

    }
    System.out.println();
}
        for (int i=1;i<=4;i++){
            for (int j =0;j<7;j++){
                System.out.print("* ");

            }
            System.out.println();
        }




    }
}