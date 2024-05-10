class Solution {
    public String solution(String rsp) {
        // 가위 2, 바위 0, 보 5
        int sci = 2;
        int rock = 0;
        int paper = 5;
        
        // 내는 값 배열
        String[] rspArr = rsp.split("");
        
        String answer = "";

        for (int n = 0; n < rspArr.length; n++) {
        String number = rspArr[n];
        if (number.equals("2")) {
                answer = answer + rock;
        } else if (number.equals("0")) {
                answer = answer + paper;

        } else {
                answer = answer + sci;
        }
}
    
        return answer;
    }
}