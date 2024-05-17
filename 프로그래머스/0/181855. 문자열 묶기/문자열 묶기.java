import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        int max = Arrays.stream(strArr)
                                .collect(Collectors.groupingBy(w -> w.length(), Collectors.counting()))
                                .values().stream()
                                .mapToInt(Long::intValue)
                                .max()
                                .orElse(0);
        return max;
    }
}