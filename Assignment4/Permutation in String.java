class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if(k>s2.length()){
            return false;
        }
        int l=0;
        int r=0;
        HashMap<Character,Integer> pmap=new HashMap<>();
        for(char c:s1.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(i>=k){
                map.put(s2.charAt(i-k), map.get(s2.charAt(i-k))-1);
                if(map.get(s2.charAt(i-k))==0){
                    map.remove(s2.charAt(i-k));
                }
            }
            if(map.equals(pmap)){
                return true;
            }   
        } 
      return false;
    }
}