import java.util.Arrays;

class Solution {
public int solution(int[] num_list, int n) {
        long count = Arrays.stream(num_list).boxed().filter(a -> a == n).count();

        int answer = (count != 0) ? 1 : 0;
        return answer;
    }
}