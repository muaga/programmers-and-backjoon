import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[9];

        // 각 입력마다 "입력하세요" 메시지 출력
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(a).max().getAsInt();
        int idx = Arrays.stream(a).boxed().collect(Collectors.toList()).indexOf(max) + 1;
        bw.write(max + "\n");
        bw.write(idx + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
