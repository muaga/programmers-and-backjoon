class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int a = 0; a < num_str.length(); a++) {
            int number = Character.getNumericValue(num_str.charAt(a));
            answer += number;
        }
        return answer;
    }
}