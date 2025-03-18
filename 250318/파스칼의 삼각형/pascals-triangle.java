import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[][] arr = new int[n][n];

        //배열 0으로 초기화
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = 0;
            }
        }

        for(int i=0; i<n; i++){
            arr[i][0] = 1;
        }
        //arr[1][1] = 1;
    
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]>=1){
                    System.out.print(arr[i][j]+" ");
                }
                 
            }
            System.out.println();
        }

    }
}