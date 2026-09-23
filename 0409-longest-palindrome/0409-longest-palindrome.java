class Solution {
    public int longestPalindrome(String s) {
        int [] charCount = new int[128];
        for(char c: s.toCharArray()){
            charCount[c]++;
        }

        int maxLength=0;
        boolean hasOddCount = false;

        for(int count : charCount){
            maxLength += (count/2)*2;
            if(count%2 == 1){
                hasOddCount = true;
            }
        }

        if(hasOddCount){
            maxLength +=1;
        }
        return maxLength;        
    }
}