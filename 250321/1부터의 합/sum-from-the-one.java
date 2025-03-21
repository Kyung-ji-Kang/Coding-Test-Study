import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sum = 1;
    int count = 1;

    while(true){
        if (n==1){
            break;
        }
        else if(sum>=n){
            count--;
            break;
        }
        else{
            sum += count;
            count++;
        }
        
    }    
    
    System.out.print(count);

    }
}