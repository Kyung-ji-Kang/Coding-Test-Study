import java.util.Scanner;
public class Main {


    public static boolean answer (int x1, int x2, int x3, int x4){
        if(x2<x3|| x4<x1){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        // Please write your code here.

        if(answer(x1,x2,x3,x4)){
            System.out.print("intersecting");
        }
        else{
            System.out.print("nonintersecting");
        }
    }
}