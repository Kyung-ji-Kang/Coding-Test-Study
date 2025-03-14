import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int result = 1;
        for(int i=1; i<m2; i++){
            result += num_of_days[i];
        }

        result += d2;

        for(int i=1; i<m1; i++){
            result -= num_of_days[i];
        }

        result -= d1;

        System.out.print(result);



        
        
    }
}
