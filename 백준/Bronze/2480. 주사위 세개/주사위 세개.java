import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 같은 눈이 3개 나오면 -> 10000원 + (같은 눈) * 1000원
        // 같은 눈이 2개 나오면 -> 1000원 + (같은 눈) * 100원
        // 모두 다른 눈 -> (가장 큰 눈) * 100원

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int money = 0;

        if (a == b && b == c) {
            money = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                money = 1000 + (a * 100);
            } else {
                money = 1000 + (b * 100);
            }
        } else {
            int max = Math.max(a, Math.max(b, c));
            money = max * 100;
        }

        System.out.println(money);
        sc.close();
    }
}
