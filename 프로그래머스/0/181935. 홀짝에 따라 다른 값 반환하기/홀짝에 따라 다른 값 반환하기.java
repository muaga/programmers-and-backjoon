class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) {
                for (int a = 1; a <= n; a += 2) {
                        answer += a;
                }
        } else {
                for (int b = 0; b <= n; b += 2) {
                        answer += (b * b);
                }
        }
        return answer;
    }
}