import java.util.Scanner;
public class Main {
    public static int needed_time(int d, int h, int m){
        // 12일 13시 14분
        // (12-11)일 (13-11)시 (14-11)분
        // 1일 2시간 3분
        // 1*24 + 2시간 3분 => 26시간 3분 26*60+3 1560+3 
        
       return ((d-11)*24*60) + ((h-11)*60) + (m-11); 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //일
        int B = sc.nextInt(); //시간
        int C = sc.nextInt(); // 분
        // Please write your code here.
        
        if(A<=11|| B<=11 && C<11){
            System.out.print("-1");
        }
        else{
            System.out.print(needed_time(A,B,C));
        }

        
        
    }
}