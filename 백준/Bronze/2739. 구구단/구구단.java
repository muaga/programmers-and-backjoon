import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a = 1; a < 10; a++) {
            System.out.println(n + " * " + a + " = " + n * a);
        }

        sc.close();
    }
}
