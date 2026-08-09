class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;

        for(int i=0; i<numbers.length ;i++){
            int current= numbers[start] + numbers[end];
            if(target==current){
                return new int[]{start+1,end+1};
            }
            if(current>target){
                end--;
            }
            if(current<target){
                start++;
            }
        }
        return new int[]{};
    }
}