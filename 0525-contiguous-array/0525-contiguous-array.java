class Solution {
    public int findMaxLength(int[] nums) {
        int count=0;
        int maxlen =0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<nums.length ;i++){
            count+=(nums[i]==1) ? 1 : -1;
            if(map.containsKey(count)){
                int subarraylen=i-map.get(count);
                maxlen = Math.max(maxlen,subarraylen);
            }else{
                map.put(count,i);
            }
        }
        return maxlen;
    }
}