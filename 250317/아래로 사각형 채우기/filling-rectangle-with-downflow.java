import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

        int[][] arr1 = new int[n][n];
        
        
        for(int i=0; i<n;i++){
            int num = i+1;
            for(int j=0; j<n; j++){
                arr1[i][j] = num;
                num += n;
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
            num++;
        }

        
    }
}
