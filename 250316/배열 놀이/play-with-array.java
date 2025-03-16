import java.util.*;

public class Main {

    //1
    public static void Fun_1(int[] arr, int a){
        System.out.println(arr[a]);
    }

    //2
    public static void Fun_2(int[] arr, int b){
        int count = 0;
        int idx = 0;
        //int[] idx = new int[arr.length];
        int min_idx = arr.length;

        for(int i=1; i<arr.length;i++){
            if(arr[i] == b){
                count++;
                idx = i;
                if(min_idx>idx){
                    min_idx= idx;
                }
            }
        }

        if(count>1){
            System.out.println(min_idx);
        }
        else if (count ==1){
            System.out.println(idx);
        }
        else{
            System.out.println(count);
        }
        
    }

    //3
    public static void Fun_3(int[] arr, int s, int e){
        for(int i=s; i<=e; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<Q; i++){
            int fun_num = sc.nextInt();

            if(fun_num==1){
                int a =sc.nextInt();
                Fun_1(arr,a);
            }
            else if(fun_num==2){
                int b =sc.nextInt();
                Fun_2(arr,b);
            }
            else if(fun_num==3){
                int s =sc.nextInt();
                int e =sc.nextInt();
                Fun_3(arr,s,e);
            }
        }

    
    }
}