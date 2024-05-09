import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        // 가장 큰 수와 해당 수가 있는 index
        int maxNumber = 0;
        int maxIndex = 0;        
        
        // 정수 배열 -> arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int n = 0; n < array.length; n++) {
                int number = array[n];
                arrayList.add(number);
        }

        maxNumber = Collections.max(arrayList); // 가장 큰 수
        maxIndex = arrayList.indexOf(maxNumber); // 가장 큰 수 index 반환
        
        
        answer[0] = maxNumber;
        answer[1] = maxIndex;
        
        return answer;
    }
}