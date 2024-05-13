class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        if (length % 2 == 1) {
                for (int a = 0; a < length; a++) {
                        if (a % 2 == 0) {
                                arr[a] = arr[a] + n;
                        }
                }
        } else {
                for (int a = 0; a < length; a++) {
                        if (a % 2 == 1) {
                                arr[a] = arr[a] + n;
                        }
                }
        }
        return arr;
    }
}