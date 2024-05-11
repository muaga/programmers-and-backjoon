class Solution {
    public String solution(String my_string, int n) {
        int startIndex = my_string.length() - n;
        String answer = my_string.substring(startIndex);
        return answer;
    }
}