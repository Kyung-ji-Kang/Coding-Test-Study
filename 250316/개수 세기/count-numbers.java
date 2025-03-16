import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        int count = 0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == M){
                count++;
            }
        }

        System.out.print(count);
    
    
    }
}