import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string, int n) {
        String answer = Stream.of(my_string.split(""))
                        .map(w -> String.join("", Collections.nCopies(n, w)))
                        .collect(Collectors.joining());
        return answer;
    }
}