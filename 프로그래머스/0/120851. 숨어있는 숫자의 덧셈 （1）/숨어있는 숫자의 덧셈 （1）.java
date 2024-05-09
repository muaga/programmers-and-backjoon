class Solution {
    public int solution(String my_string) {
        
        // 문자열 속 모든 자연수의 총 합
        int answer = 0;

        // 자연수 뽑기
        char[] word = my_string.toCharArray();

        for (int a = 0; a < my_string.length(); a++) {
                int asc = word[a]; // 아스키코드
                if (47 < asc && asc < 58) {
                        int number = Character.getNumericValue(word[a]); // char -> int값
                        answer = answer + number;
                }
}
        
        return answer;
    }
}