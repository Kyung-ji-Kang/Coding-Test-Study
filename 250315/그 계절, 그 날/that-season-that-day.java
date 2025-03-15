import java.util.Scanner;
public class Main {

    //계절 파악
    public static void Season(int m){
        if (m==3||m==4||m==5){
            System.out.print("Spring");
        }
        else if(m==6||m==7||m==8){
            System.out.print("Summer");
        }
        else if (m==9||m==10||m==11){
            System.out.print("Fall");
        }
        else if (m==12||m==1||m==2){
            System.out.print("Winter");
        }
    }

    //날짜가 있는 지 파악
    public static int month_to_day(int m){
        int[] moth_have_days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return moth_have_days[m];
    }



    // 윤년인지 파악
    public static boolean yoon(int y){
        if (y%4==0 && y%100 == 0){//4의 배수이고 100의 배수
            return false;
        }
        else if(y%4==0 && y%100 == 0 && y%400 == 0 ){
            return true;
        }
        else if(y%4==0){
            return true;
        }
        else{
            return false;
        }
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        if(yoon(y)&& d==29){
            System.out.print("Winter");
        }
        else if(month_to_day(m)<d){
            System.out.print("-1");
        }
        else{
            Season(m);
        }
    }
}