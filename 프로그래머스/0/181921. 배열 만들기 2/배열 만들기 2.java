import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> numberList = new ArrayList<>();
        
        // 5 50 55 500 505 550, 555 / 5
        // 1 10 11 100 101 110 111
        // 1 2 3 4 5 6 7
        // byte네..........
        
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

        // 이진수 -> 숫자
        // int decimal = Integer.parseInt(binary(string타입), 2);

        // 숫자 -> 이진수
        // String byte = Integer.toBinaryString(number(int타입));