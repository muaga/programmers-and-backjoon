import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
       String answer = Stream.of(myString.split(""))
                        .map(w -> w.charAt(0) < 108 ? "l" : w)
                        .collect(Collectors.joining());
        return answer;
    }
}