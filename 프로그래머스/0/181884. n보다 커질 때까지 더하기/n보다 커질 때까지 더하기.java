class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int a = 0; a < numbers.length; a++) {
        answer = answer + numbers[a];
        if (answer > n) {
                break;
        }
}
        
        return answer;
    }
}