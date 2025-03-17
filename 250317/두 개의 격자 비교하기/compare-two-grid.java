import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];

        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                if(arr1[i][j]==arr2[i][j]){
                    System.out.print(0+" ");
                }
                else{
                     System.out.print(1+" ");
                }
            }
            System.out.println("");
        }
    }
}