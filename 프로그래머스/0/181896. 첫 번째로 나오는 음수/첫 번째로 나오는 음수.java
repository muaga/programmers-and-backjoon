import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        
        // 음수만을 가진 배열을 만든다.
        int[] negative = Arrays.stream(num_list)
                        .filter(n -> n < 0)
                        .toArray();
        
        // 음수 배열의 첫번째 값을 Arrays.stream()을 통해 찾아서 해당 index를 뽑는다.
        int answer = negative.length > 0 ? Arrays.stream(num_list)
                        .boxed()
                        .collect(Collectors.toList()) // 배열 -> List로 변환
                        .indexOf(negative[0]) : -1; // 해당 List의 index = 해당 배열의 index        
        return answer;
    }
}