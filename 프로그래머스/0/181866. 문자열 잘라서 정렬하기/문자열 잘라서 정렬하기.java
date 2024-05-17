import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = Stream.of(myString.split("x"))
                        .filter(w -> w.length() > 0)
                        .sorted()
                        .toArray(String[]::new);

        Arrays.sort(strArr);
        return strArr;
    }
}