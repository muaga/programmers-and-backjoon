class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int n = 0; n < index_list.length; n++) {
                int idx = index_list[n];
                String word = my_string.substring(idx, idx + 1);
                answer = answer + word;
        }        
        
        return answer;
    }
}