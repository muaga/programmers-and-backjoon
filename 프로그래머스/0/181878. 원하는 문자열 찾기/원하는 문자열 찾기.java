class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        // 모두 대문자로 변경
        String upString = myString.toUpperCase();
        String upPat = pat.toUpperCase();

        // 포함 여부 비교
        if (upString.contains(upPat)) {
                answer = 1;
        } else {
                answer = 0;
        }
        
        return answer;
    }
}