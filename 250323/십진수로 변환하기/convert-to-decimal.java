import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int len = binary.length();
        int[] arr =new int[len];

        

        for(int i=0; i<len; i++){
            arr[i] = binary.charAt(i) - '0';
        }

        int sum = 0;
        for(int i=0; i<len; i++){
            sum = (sum*2)+arr[i];
        }
    
        System.out.println(sum);
    }
}