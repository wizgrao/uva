import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            if (n == 0)
                break;
            int prev = s.nextInt();
            boolean[] found = new boolean[n-1];
            for(int i = 1; i < n; i++) {
                int a = s.nextInt();
                if(Math.abs(prev - a) < n && prev != a) 
                    found[Math.abs(prev - a) - 1] = true;
                prev = a;
            }
            boolean jolly = true;
            for(int i = 0; i < n-1; i++) {
                if (!found[i]) {
                    jolly = false;
                    break;
                }
            }
            if (jolly) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }
}

