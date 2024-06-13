import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int n = 1; n <= t; n++) {
            for (int s = 1; s <= n; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
