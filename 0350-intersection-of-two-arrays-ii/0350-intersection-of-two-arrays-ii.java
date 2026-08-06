class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> intersectionMap = new HashMap<>();

        for(int num:nums1){
            intersectionMap.put(num,intersectionMap.getOrDefault(num,0)+1);
        }

        List<Integer> intersectionList = new ArrayList<>();

        for(int num: nums2){
            if(intersectionMap.containsKey(num) && intersectionMap.get(num)>0){
                intersectionList.add(num);
                intersectionMap.put(num, intersectionMap.get(num)-1);
            }
        }
        
        int[] result = new int[intersectionList.size()];
        for(int i=0; i<intersectionList.size();i++){
            result[i]=intersectionList.get(i);
        }
        return result;
    }
}