class Solution {
    public int solution(String my_string, String is_suffix) {
        int endIdx = my_string.length();
        int startIdx = endIdx - is_suffix.length();

        String suffix = my_string.length() >= is_suffix.length() 
                        ? my_string.substring(startIdx, endIdx)
                        : "null";

        int answer = (is_suffix.equals(suffix)) ? 1 : 0;
        return answer;
    }
}