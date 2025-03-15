import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] arr = new int[10];

       for(int i=0; i<10; i++){
        arr[i] = sc.nextInt();
       }

        int idx = 0;
        int sum = 0;
        int count = 0;

       while(true){
        
            if(arr[idx]==0||idx==9){
                break;
            }
            else if(arr[idx]%2==0){
                sum += arr[idx];
                idx++; 
                count++;
            }
            else{
                idx++;
            }

       }

        System.out.print(count+" "+sum);

    }
}
