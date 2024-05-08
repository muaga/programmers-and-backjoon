import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // 배열
        int[] answer = {};
        
        // List
        // (add를 위해 List 사용, 배열만을 사용하기에는 index 이슈로 인해 for문이 힘들었다....)
        ArrayList<Integer> list = new ArrayList<>();

        for (int a = 0; a <= n; a++) {
                if (a % 2 == 1) {
                        // n이하 홀수를 오름차순으로 배열에 넣기
                        list.add(a);
                }
        }
        
        // 배열의 크기 설정(for문 안에 들어가면 새로 reset이 된다.)
        answer = new int[list.size()];

        for (int b = 0; b < list.size(); b++) {
                answer[b] = (int) list.get(b);
        }
        
        return answer;
    }
}