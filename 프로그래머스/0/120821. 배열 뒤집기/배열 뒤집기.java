import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;


class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answerList = Arrays.stream(num_list)
                        .boxed() // IntStream을 Stream<Integer>로 변환
                        .collect(Collectors.toList());

        Collections.reverse(answerList);

        int [] answer = answerList.stream().mapToInt(Integer::intValue).toArray(); 
        return answer;
    }
}