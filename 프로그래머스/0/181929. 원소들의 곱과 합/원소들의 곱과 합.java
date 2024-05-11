import java.util.Arrays;


class Solution {
    public int solution(int[] num_list) {
        int multi = Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        int sum = Arrays.stream(num_list).sum();

        int answer = 0;

        if (multi < sum * sum) {
                answer = 1;
        }
        return answer;
    }
}