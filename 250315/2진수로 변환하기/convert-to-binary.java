import java.util.Scanner;
public class Main {
    
    public static void binary(int n){
        int[] digit = new int[50];
        int count = 0;
        while(true){
            if (n<2){
                digit[count++] = n;
                break;
            }
            
            digit[count++] = n%2;
            n = n/2;
        }

        for(int i=count-1; i>=0; i--){
            System.out.print(digit[i]);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Please write your code here.
        binary(n);

    }
}