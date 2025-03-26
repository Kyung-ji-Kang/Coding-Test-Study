import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc =  new Scanner(System.in);
        
        int sum = 0;
        for(int i=0; i<2; i++){
            String st = sc.next();
            sum += st.length();    
        }
        System.out.println(sum);
    }
}