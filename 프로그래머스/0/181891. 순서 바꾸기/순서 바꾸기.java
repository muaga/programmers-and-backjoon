import java.util.stream.IntStream;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] num_list, int n) {
    int[] after = Arrays.copyOfRange(num_list, n, num_list.length);
    int[] before = Arrays.copyOfRange(num_list, 0, n);
        
    int[] answer = IntStream.concat(Arrays.stream(after), Arrays.stream(before)).toArray();
        return answer;
    }
}