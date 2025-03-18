import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        int num = 0;
        for(int i=0; i<M;i++){
            if(i%2==0){
                for(int j=0; j<N; j++){
                    arr[j][i] = num++;
                }
            }
            else{
                for(int j=N-1; j>=0; j--){
                    arr[j][i] =num++;
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}