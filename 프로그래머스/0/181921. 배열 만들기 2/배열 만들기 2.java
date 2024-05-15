import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> numberList = new ArrayList<>();
        
        int b = 1;
        
        for (int a = l; a <= r; a++) {
                int re = Integer.parseInt(Integer.toBinaryString(b)) * 5;
                b++;
                if (l <= re && re <= r) {
                        numberList.add(re);
                }
                if (r < re) {
                        break;
                }
        }

        int[] answer = (numberList.isEmpty()) ? new int[]{-1} : numberList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}