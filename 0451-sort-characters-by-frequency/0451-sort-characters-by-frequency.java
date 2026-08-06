class Solution {
    public String frequencySort(String s) {
        if(s== null || s.isEmpty()){
            return s;
        }

        Map<Character , Integer> freqMap = new HashMap<>();

        for(char c: s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        List<Character>[] bucket = new List[s.length()+1];

        for(char key : freqMap.keySet()){
            int frequency = freqMap.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();

        for(int i =bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(char c: bucket[i]){
                    for(int j=0; j<i ;j++){
                        sb.append(c);
                    }
                }
            }
        }        
        return sb.toString();
    }
}