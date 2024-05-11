class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        int idx = 0;

        for (int n = start; n >= end_num; n--) {
                answer[idx] = n;
                idx++;
        }
        return answer;
    }
}