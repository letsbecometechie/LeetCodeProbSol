class Solution {

    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

        int c1 = 0, c2 = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            c1 += set.contains(s.charAt(i)) ? 1 : 0;
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            c2 += set.contains(s.charAt(i)) ? 1 : 0;
        }

        return c1 == c2;
    }
}
