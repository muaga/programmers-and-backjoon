import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        String strTime = String.format("%02d:%02d", H, M);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeDate = LocalTime.parse(strTime, formatter);
        LocalTime newTime = timeDate.minusMinutes(45);

        int hour = newTime.getHour();
        int minute = newTime.getMinute();

        System.out.println(hour + " " + minute);
        sc.close();
    }
}
