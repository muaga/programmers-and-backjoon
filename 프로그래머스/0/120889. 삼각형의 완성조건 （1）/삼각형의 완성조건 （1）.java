
import java.util.Arrays;


class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);

        int sum = sides[0] + sides[1];
        int max = sides[2];

        int answer = (sum > max) ? 1 : 2;
        
        return answer;
    }
}