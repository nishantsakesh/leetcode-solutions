class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            char leftCh= s.charAt(start);
            char rightCh= s.charAt(end);
            
            if(!Character.isLetterOrDigit(leftCh)){
                start++;
                //continue;
            }
            else if(!Character.isLetterOrDigit(rightCh)){
                end--;
                //continue;
            }
            else if(Character.toLowerCase(leftCh)!=Character.toLowerCase(rightCh)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;        
    }
}