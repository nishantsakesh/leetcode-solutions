class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        //1st loop / left products
        result[0] = 1;
        for(int i=1 ; i<n ; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        //2nd loop/ right products
        int rightProducts =1;
        for(int i = n-1; i>=0 ; i--){
            result[i] = result[i] * rightProducts;
            rightProducts *= nums[i];
        }
        return result;
                
    }
}