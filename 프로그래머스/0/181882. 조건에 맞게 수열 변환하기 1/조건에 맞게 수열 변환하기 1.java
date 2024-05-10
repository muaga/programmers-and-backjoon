import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
    // 조건에 맞는 값을 넣을 List
    List<Integer> returnList = new ArrayList<>();

    for (int n = 0; n < arr.length; n++) {
            int number = arr[n];
            if (number >= 50 && number % 2 == 0) {
                    returnList.add(number / 2);
            } else if (number < 50 && number % 2 == 1) {
                    returnList.add(number * 2);
            } else {
                    returnList.add(number);
            }
    }
    int[] answer = returnList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}