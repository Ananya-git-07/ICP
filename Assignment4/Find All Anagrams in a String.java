import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int k=p.length();
        if(k>s.length()){
            return list;
        }
        HashMap<Character,Integer> pmap=new HashMap<>();
        for(char c : p.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char chin=s.charAt(i);
            map.put(chin,map.getOrDefault(chin,0)+1);    
            if(i>=k){
                char chout=s.charAt(i-k);
                map.put(chout,map.get(chout)-1);
                if(map.get(chout)==0){
                    map.remove(chout);
                }
            }
            if(i>=k-1 && map.equals(pmap)){
                list.add(i-k+1);
            }
        }
        return list;
    }
}
