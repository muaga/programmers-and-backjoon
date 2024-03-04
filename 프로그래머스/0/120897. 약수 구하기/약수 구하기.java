import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // n의 약수를 리스트에 담을 수 있게 새로운 arrayList를 만든다.
        List<Integer> answerList = new ArrayList<>();
        for(int a = 1; a <= n; a++){
            if(n%a == 0){
                answerList.add(a);
            }
        }
        // stream을 통해 Integer -> int 타입의 list로 변경해준다.
        return answerList.stream().mapToInt(i->i).toArray();
    }
}