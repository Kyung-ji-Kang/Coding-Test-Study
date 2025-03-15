import java.util.*;

public class Main {
    static final int N = 10;

    public static void main(String[] args) {
        // Please write your code here.
        
        Scanner sc = new Scanner(System.in);

        int[] arr =new int[N];

        int sum=0;
        int count=0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            
            if(arr[i]>=250){
                sum -= arr[i];
                count = i;
                break;
            }
            count++;
        }

        float aver = (float)sum/count;
        String aver_formated = String.format("%.1f", aver);

       System.out.println(sum+" "+aver_formated); // "3.1
    }
}