import java.util.Arrays;
import java.util.Random;

public class MultiArrayRandomGrid {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int sum = 0;
       // int add = 0;

        int[][] row = new int[9][9];
       
        
        System.out.println("\t" + "0" + "\t" + "1" + "\t" + "2" + "\t" + "3\t" + "4\t" + "5\t" + "6\t" + "7\t" + "8\t");
        System.out.println("__________________________________________________________________________");

        for (int j = 0; j < row.length; j++) {
            System.out.print(j + " |\t");
            for (int i = 0; i < row.length; i++) {
                int x = randomGenerator.nextInt(100);
                row[j][i]= x;
                System.out.print(row[j][i] + "\t");
                sum = sum + x;
               //add = add + row[i][j];
            }
            //System.out.print(add);
            System.out.print("sum = " + sum);
            System.out.println();
            sum = 0;
            add = 0;
            
        }

    }

}
