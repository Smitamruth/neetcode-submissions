class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cA1 = s.toCharArray();
        char[] cA2 = t.toCharArray();

        Arrays.sort(cA1);
        Arrays.sort(cA2);

        if(Arrays.equals(cA1, cA2)){
            System.out.println("Anagrams");
            return true;
        } else {
            System.out.println("Not Anangrams");
            return false;
        }
    }
}
