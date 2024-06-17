import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // n값 처리

        int n = Integer.parseInt(st.nextToken()); // 문자열로 받기 때문에 int형으로 형변환
        int[] a = new int[n]; //

        st = new StringTokenizer(br.readLine(), " "); // 수열 a에 입력값 처리

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}