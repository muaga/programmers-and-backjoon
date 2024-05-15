import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> intArr = new ArrayList<>();

        for (String intStr : intStrs) {
                int number = Integer.parseInt(intStr.substring(s, s + l));
                if (k < number) {
                        intArr.add(number);
                }
        }

        int[] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}