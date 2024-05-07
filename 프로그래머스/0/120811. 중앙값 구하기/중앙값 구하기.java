import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(array);

        // 배열의 길이
        int arrayLength = array.length;

        // 중앙 값 index 찾기
        int middleIndex = arrayLength / 2;
 
        // 중앙 값 찾기
        answer = array[middleIndex];
        return answer;
    }
}