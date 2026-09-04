class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;

        HashMap<Character,Integer> map = new HashMap<>();
        int maxi = 0;

        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

            if(map.size()== j-i+1){
                maxi = Math.max(maxi,j-i+1);
                j++;
            }

            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    char chi = s.charAt(i);
                    map.put(chi,map.get(chi)-1);
                    if(map.get(chi)==0){
                        map.remove(chi);
                    }
                    i++;
                }

                j++;
            }
        }

        return maxi;

    }
}