class Solution {
   public static boolean halvesAreAlike(String s) {

        int length = s.length();

        int c1= countVowels(s.substring(0, length/2));
        int c2 = countVowels(s.substring(length/2, length));

        return c1==c2;
    }

    private static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'a':
                case 'A':

                case 'e':
                case 'E':

                case 'i':
                case 'I':

                case 'o':
                case 'O':

                case 'u':
                case 'U':
                    count++;
                    break;
            }

        }
        return count;
    }
}