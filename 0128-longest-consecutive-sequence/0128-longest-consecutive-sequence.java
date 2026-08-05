class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();
        for(int num : nums){
            numset.add(num);
        }
        int longeststreak =0;

        for(int num:numset){
            if(!numset.contains(num -1)){
                int currentNum =num;
                int currentstreak =1;

                while(numset.contains(currentNum+1)){
                    currentNum+=1;
                    currentstreak+=1;
                }
                longeststreak = Math.max(longeststreak,currentstreak);
            }
        }        
        return longeststreak;
    }
}