import java.util.Scanner;
public class Main {

    public static final int MAX = 100; 

    //최대값을 찾는 함수
    public static int Find_Max(int[] arr){
        
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //최소값을 찾고 그 최소값이 음수인지 판단하고 처리하는 함수

    public static int Find_Min(int[] x1, int[] x2){
        int min = 0;

        for(int i=0; i<x1.length; i++){
            if (x1[i]<min){
                min = x1[i];
            }
        }
        
        if(min<0){
            return -min;
        }
        else{
            return 0;
        }
    }


    public static void Max_Stack(int[] arr, int[] x1, int[] x2, int plus){

        for(int i=0; i<x1.length; i++){
            for(int idx_x1 = x1[i]+plus; idx_x1<=x2[i]-1+plus;idx_x1++){
            arr[idx_x1] += 1;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] arr = new int[MAX+1];
        int plus = Find_Min(x1,x2);

        Max_Stack(arr,x1,x2,plus);
        
        System.out.print(Find_Max(arr));
        

    }
}