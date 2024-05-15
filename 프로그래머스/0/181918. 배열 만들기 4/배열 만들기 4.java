import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        // 새로운 stk 만든다.
        List<Integer> stkList = new ArrayList<>();

        // 변수 i
        int i = 0; // i가 arr의 길이보다 작으면 시작

        // stk 빈 배열이면
        while (i < arr.length) {
                if (stkList.isEmpty()) {
                        stkList.add(arr[i]);
                        i++;
                } else if (!stkList.isEmpty() && stkList.get(stkList.size() - 1) < arr[i]) {
                        stkList.add(arr[i]);
                        i++;
                } else if (!stkList.isEmpty() && stkList.get(stkList.size() - 1) >= arr[i]) {
                        stkList.remove(stkList.size() - 1);
                }

                if (i == arr.length) {
                        break;
                }
        }

        int[] stk = stkList.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}