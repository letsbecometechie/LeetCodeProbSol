class Solution {

    public int minimumAverageDifference(int[] nums) {
        long suffsum=0, prefixsum=0, suffavg=0, prefixavg=0, n=nums.length;
            int minavg = Integer.MAX_VALUE;
            int index = 0;
            for(int i=0;i<n;i++){
                suffsum+=nums[i];
            }
            for(int i=0;i<n;i++){
                int j=i;

                prefixsum+=nums[i];
                prefixavg= prefixsum/(j+1);

                suffsum-=nums[i];
                suffavg= suffsum == 0 ? 0 :  suffsum/(n-i-1);

                int currDiff=(int) Math.abs(prefixavg - suffavg);

                if(currDiff < minavg){
                    minavg= currDiff;
                    index=i;
                }
            }
            return index;
    }
}
