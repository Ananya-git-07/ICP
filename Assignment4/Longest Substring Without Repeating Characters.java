class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int l=0;
        int r=0;
        HashSet<Character> set=new HashSet<>();
        while(r<s.length()){
             char ch=s.charAt(r);
             while(set.contains(ch) && l<r){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(ch);
                r++;
                maxlength=Math.max(r-l,maxlength);
             }
        return maxlength;
        }
    }
