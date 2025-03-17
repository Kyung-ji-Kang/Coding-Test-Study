import java.util.*;

public class Main {
    
    static final int row = 3;
    static final int column = 3;
    
    public static void main(String[] args) {
        // Please write your code here.
    
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
    
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr1[i][j]*arr2[i][j]+" ");
            }
        System.out.println("");
        }
        
    
    }
}