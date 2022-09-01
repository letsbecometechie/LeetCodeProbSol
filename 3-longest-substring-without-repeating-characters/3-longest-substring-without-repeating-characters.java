class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int end=0, start=0, max=0, n=s.length();
        
        while(end<n)
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
                max=Math.max(max,set.size());
            }
            else
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
        
    }
}