import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        // x - 영수증에 적힌 총 금액
        // n - 영수증에 적힌 물건의 종류의 수

        for(int f = 0; f<n; f++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = (a*b) + sum;            
        }

        if(sum == x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
