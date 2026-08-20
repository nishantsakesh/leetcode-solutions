class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length ; i++ ) {
            int current = nums[i];
            int tempMax = Math.max(current,Math.max(maxProd * current , minProd * current));
            minProd = Math.min(current , Math.min(minProd * current , maxProd * current));
            maxProd = tempMax;
            result = Math.max(result , maxProd);
        }       
        return result;
    }
}