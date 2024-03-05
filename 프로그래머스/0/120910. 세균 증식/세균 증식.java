class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int a = 0; a<t; a++){
            n = n * 2;
        }
        answer = n;
        return answer;
    }
}