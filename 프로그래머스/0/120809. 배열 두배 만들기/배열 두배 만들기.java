import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.setAll(numbers, i -> numbers[i] * 2);
        return numbers;
    }
}