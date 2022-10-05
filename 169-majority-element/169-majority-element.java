class Solution {
    public int majorityElement(int[] arr) {
        int count =0;
        int element=0;
        int size=arr.length;
        
        for(int i=0;i<size;i++){
            if(count==0){
                element=arr[i];
            }
            if(element==arr[i]){
                count++;
            }
            else
            {
                count-=1;
            }
        }
        
        return element;
    }
}