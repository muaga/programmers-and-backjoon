import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String ad = "ad";

        String[] answer =  Arrays.stream(strArr).filter(word -> !word.contains(ad)).toArray(String[]::new);
        return answer;
    }
}