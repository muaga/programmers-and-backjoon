class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 장군 개미 공격력
        int generalAnt = 5;

        // 병정 개미 공격력
        int soldierAnt = 3;

        // 일개미 공격력
        int workerAnt = 1;

        // 장군 개미
        int generalCount = hp / generalAnt;
        int firstRemain = hp % generalAnt;

        // 병정 개미
        int soldierCount = firstRemain / soldierAnt;
        int secondRemain = firstRemain % soldierAnt;

        // 일개미
        int workerCount = secondRemain / workerAnt;

        // 총 개미 수
        answer = generalCount + soldierCount + workerCount;
        
        return answer;
    }
}