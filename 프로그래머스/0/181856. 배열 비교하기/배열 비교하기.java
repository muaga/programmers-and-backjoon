import java.util.Arrays;


class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int arr1Sum = Arrays.stream(arr1).sum();
        int arr2Sum = Arrays.stream(arr2).sum();

        int answer = (arr1Length != arr2Length)
                        ? (arr1Length > arr2Length ? 1 : -1)
                        : (arr1Sum != arr2Sum ? arr1Sum > arr2Sum ? 1 : -1 : 0);
        return answer;
    }
}