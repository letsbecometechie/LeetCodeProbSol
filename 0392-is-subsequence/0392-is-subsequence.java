class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0){
            return true;
        }
        
        int index=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            flag=false;
            while(index<t.length()){
                char b=t.charAt(index);
                if(a==b){
                    flag=true;
                    index++;
                    break;
                }
                index++;
            }
        }
        return flag;
    }
}