import java.util.Scanner;
import java.util.*;
public class Main {


    public static void menu(ArrayList<Integer> arry, String command ){
        if (command.equals("size")){
            System.out.println(arry.size());
        }
        else if (command.equals("pop_back") ){
            arry.remove(arry.size()-1);
        }
    }

    public static void menu(ArrayList<Integer> arry, String command, int num ){
        if (command.equals("push_back")){
            arry.add(num);
        }
        else if (command.equals("get")){
            System.out.println(arry.get(num-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            String command = sc.next(); 
           if (command.equals("push_back")||command.equals("get")){
            int num = sc.nextInt();
                menu(arr,command,num);
           }
           else{
                menu(arr,command);
           }
        }
    }


 }
