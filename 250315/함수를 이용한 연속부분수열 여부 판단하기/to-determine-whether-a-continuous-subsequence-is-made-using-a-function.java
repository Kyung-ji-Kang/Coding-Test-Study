import java.util.Scanner;

public class Main {

    public static int idx(int[] a, int[] b){

        for(int i=0; i<a.length; i++){
            if(a[i]==b[0]){
                return i;
            }
        }
        return -1;
    }

    public static boolean IsAnswer(int[]a, int[] b){
        
        int init_idx = idx(a,b);
        int len = a.length - b.length;

        for(int i=0; i<len;i++){
            if (b[i]==a[init_idx++]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if(IsAnswer(a,b)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }


    }
}