class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> map=new HashMap<>();
    int l=0;
    int r=0;
    int maxlength=0;
    int maxfreq=0;
    while(r<s.length()){
      char ch=s.charAt(r);
      map.put(ch,map.getOrDefault(ch,0)+1);
      maxfreq=Math.max(maxfreq,map.get(ch));
      if((r-l)-maxfreq>=k){
          char chleft=s.charAt(l);
          map.put(chleft,map.get(chleft)-1);
          l++;
      }
      maxlength=Math.max(maxlength,r-l+1); 
      r++;
    }
    return maxlength;
    }
}
