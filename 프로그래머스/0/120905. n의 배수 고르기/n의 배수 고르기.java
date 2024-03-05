import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = Arrays.stream(numlist).filter(t -> t % n == 0).toArray();
        return answer;
    }
}