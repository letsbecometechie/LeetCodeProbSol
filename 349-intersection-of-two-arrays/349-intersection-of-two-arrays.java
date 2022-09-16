class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for(int num : nums1){
            set1.add(num);
        }
        
        for(int num : nums2){
            if(set1.contains(num)){
                set2.add(num);
                set1.remove(num);
            }
        }
        
        int res[] =new int[set2.size()];
        int index=0;
        for(int num:set2){
            res[index++]=num;
        }
        
        return res;
    }
}