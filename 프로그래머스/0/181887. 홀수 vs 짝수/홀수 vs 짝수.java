class Solution {
    public int solution(int[] num_list) {
        // 홀수 합
        int odd = 0;

        // 짝수 합
        int even = 0;
        
        // 더 큰 값
        int answer = 0;
        
        for (int a = 0; a < num_list.length; a++) {
            if (a % 2 == 1) {
                    odd = odd + num_list[a];
            } else {
                    even = even + num_list[a];
            }
        }
        
        answer = (odd > even) ? odd : even;

        return answer;
    }
}