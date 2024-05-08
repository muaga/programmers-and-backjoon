class Solution {
    public String solution(String cipher, int code) {
        
        // 문자열 -> 배열로
        char[] cipherArr = cipher.toCharArray();
        
        // 번째 갯수
        int count = cipher.length() / code;
        
        // 해독된 암호
        String answer = "";
        
        for (int a = 1; a <= count; a++) {
        int num = code * a;
        char word = cipherArr[num - 1];
        answer = answer + word;
}
        
        return answer;
    }
}