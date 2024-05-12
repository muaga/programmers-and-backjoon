class Solution {
    public int solution(String my_string, String is_prefix) {
        int endIdx = is_prefix.length();

        String prefix = my_string.length() >= endIdx 
                                ? my_string.substring(0, endIdx) : "null";

        int answer = (is_prefix.equals(prefix)) ? 1 : 0;
        return answer;
    }
}