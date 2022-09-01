class Solution {
    public int reverse(int x) {
        long result=0;
        int y;
        
        boolean neg = false;
        if(x<0)
        {
            neg=true;
            x*=-1;
        }
        while(x > 0)
        {
            result = (result*10 )+ (x%10);
             x = x/10;
        }
        
        if(result > Integer.MAX_VALUE)
        {
            return 0;
        }
               
        return neg ? (int)(result*-1) : (int)(result);
        
    }
}