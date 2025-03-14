import java.util.Scanner;
public class Main {

    public static String what_day(int result) {
        if (result == 0)
            return "Mon";
        else if (result == 1)
            return "Tue";
        else if (result == 2)
            return "Wed";
        else if (result == 3)
            return "Thu";
        else if (result == 4)
            return "Fri";
        else if (result == 5)
            return "Sat";
        else
            return "Sun"; 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        // 1. 월마다 몇일이 있는지 확인 해야함
        // 2. +7 마다 월요일이 돌아옴 
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        

        int days1 = d1;
        int days2 = d2;
        for(int i=1; i<m1; i++){
            days1 += num_of_days[i];
        } 
        for(int i=1; i<m2; i++){
            days2 += num_of_days[i];
        } 
        int result = days2 - days1 ;
        result = ((result % 7) + 7) % 7;

        System.out.println(what_day(result));
            
    }
}