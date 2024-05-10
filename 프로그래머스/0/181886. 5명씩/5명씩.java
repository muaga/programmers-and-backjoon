import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        
        // 담을 List
        List<String> firstList = new ArrayList<>();

        // 5명씩 자른다면, 0, 5, 10... 번지에 있는 사람들
        for (int n = 0; n < names.length; n += 5) {
                firstList.add(names[n]);
        }
        System.out.println(firstList);

        // 5명씩 잘라서 0번지 배열의 사람을 담아야 한다.
        String[] answer = firstList.stream().toArray(String[]::new);
        
        return answer;
    }
}