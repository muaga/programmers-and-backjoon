import java.util.Arrays;
import java.util.stream.IntStream;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr)
                        .flatMap(n -> IntStream.range(0, n).map(i -> n))
                        .toArray();
        return answer;
    }
}