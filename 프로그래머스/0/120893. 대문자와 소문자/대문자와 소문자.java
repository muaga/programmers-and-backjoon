class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int n = 0; n < my_string.length(); n++) {
        String word = my_string.substring(n, n + 1);
        if (word == word.toUpperCase()) {
                answer = answer + word.toLowerCase();
        } else {
                answer = answer + word.toUpperCase();
        }
}
        
        return answer;
    }
}