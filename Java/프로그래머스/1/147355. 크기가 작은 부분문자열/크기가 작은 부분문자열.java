class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int count =0;
        
        for(int i=0;i<t.length()-len+1;i++){
            if (t.substring(i, i + len).compareTo(p) <= 0) count++;
        }
        

        return count;
    }
}