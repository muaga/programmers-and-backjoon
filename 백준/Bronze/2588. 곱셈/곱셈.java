import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1의 자리 구하기
        int ones = b % 10;
        // 10의 자리 구하기
        int tens = (b / 10) % 10;
        // 100의 자리 구하기
        int hundreds = (b / 100) % 10;
        
        System.out.println(a * ones);
        System.out.println(a * tens);
        System.out.println(a * hundreds);
        System.out.println(a * b);
        sc.close();
    }
}