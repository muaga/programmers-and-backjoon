import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(numbers).max().getAsInt();
        int idx = Arrays.stream(numbers).boxed().collect(Collectors.toList()).indexOf(max) + 1;
        bw.write(max + "\n");
        bw.write(idx + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
