import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        int[] A = new int[N1];
        int[] B = new int[N2];

        for(int i=0; i<N1; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N2; i++){
            B[i] = sc.nextInt();
        }
        
        String Answer = "";
        if(N1<N2){
            Answer = "No";
        }
        else if(N1==N2){
            for(int i=0;i<N1;i++){
                if(A[i]==B[i]){
                    Answer = "Yes";
                }
                else{
                    Answer = "No";
                    break;
                }
            }
        }
        else{
            int A_idx = 0;
            for(int i=0; i<N1-N2; i++){
                if(B[0]==A[i]){
                    A_idx = i;
                    break;
                }
            }

            for(int i=0; i<N2; i++){
                if(A[A_idx++] == B[i]){
                    Answer = "Yes";
                }
                else{
                    Answer = "No";
                }
            }

        }
          
          System.out.print(Answer);
    }

}
