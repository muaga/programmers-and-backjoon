class Solution {
    public String solution(String my_string, int num1, int num2) {
        char num1ch = my_string.charAt(num1);
        char num2ch = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.setCharAt(num1, num2ch);
        sb.setCharAt(num2, num1ch);
        String answer = sb.toString();
        return answer;
    }
}