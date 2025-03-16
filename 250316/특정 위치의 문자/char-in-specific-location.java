import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] words = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };

        Scanner sc = new Scanner(System.in);
        
        char word = sc.next().charAt(0);

        int idx = -1;

        
        for (int i = 0; i < 6; i++) {
            if (words[i] == word) {
                idx = i;
            }
        }

        
        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }

    }
}

