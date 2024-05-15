import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        arr = Arrays.stream(arr)
                        .filter(n -> Arrays.stream(delete_list).noneMatch(x -> x == n))
                        .toArray();
        return arr;
    }
}