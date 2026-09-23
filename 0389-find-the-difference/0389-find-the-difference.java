class Solution {
    public char findTheDifference(String s, String t) {
        char result =0;
        
        for(int j=0; j<s.length(); j++){
            result ^= s.charAt(j);
        }
        for(int i=0; i<t.length(); i++){
           result ^= t.charAt(i);
        }
        
        return result;        
    }
}