import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][ ] arr = new int[row][column];

        int num = 1;
        for(int i=0; i<row; i++){
            for(int j=0 ; j<column; j++){
                arr[i][j] = num;
                System.out.print(arr[i][j]+" ");
                num++;
            }
            System.out.println();
        }

        
    }

}