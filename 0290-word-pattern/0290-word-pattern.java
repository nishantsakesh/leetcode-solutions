class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character, String> charToWord = new HashMap<>();
        Set<String> useWords = new HashSet<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(c)){
                if(!charToWord.get(c).equals(word)){
                    return false;
                }
            } else{
                if(useWords.contains(word)){
                    return false;
                }
                charToWord.put(c,word);
                useWords.add(word);
            }
        }
        return true;
    }
}