import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.print(sum);


    }
}