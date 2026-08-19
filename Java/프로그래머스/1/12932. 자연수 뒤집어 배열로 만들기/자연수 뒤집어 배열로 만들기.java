class Solution {
    public int[] solution(long n) {
        String strNum = String.valueOf(n);
        int len = strNum.length();
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = strNum.charAt(len - 1 - i) - '0';
        }

        return answer;
    }
}