import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Solution {
    public int solution(String[] s1, String[] s2) {
        
        List<String> s1List = Arrays.stream(s1).collect(Collectors.toList());
        List<String> s2List = Arrays.stream(s2).collect(Collectors.toList());

        String[] sames = s1List.stream()
                                .filter(s -> s2List.stream().anyMatch(Predicate.isEqual(s)))
                                .toArray(String[]::new);
        int answer = 0;
        answer = sames.length;
        return answer;
    }
}