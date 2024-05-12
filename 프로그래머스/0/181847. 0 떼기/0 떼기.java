class Solution {
    public String solution(String n_str) {
        int startIdx = 0;

        for (int n = 0; n < n_str.length(); n++) {
                char word = n_str.charAt(n);
                if (word != '0') {
                        startIdx = n;
                        break;
                }
        }

        String answer = n_str.substring(startIdx);
        
        // String answer = "" + Integer.parseInt(n_str);
        // 이거면 끝.... 찢었다!
        return answer;
    }
}