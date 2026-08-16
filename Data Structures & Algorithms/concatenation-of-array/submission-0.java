class Solution {
    public int[] getConcatenation(int[] nums) {
        int numDigs = 2* (nums.length);
        int[] sums = new int[numDigs];

        for(int i = 0; i < nums.length; i++){
            int n = nums.length;
            sums[i] = nums[i];
            sums[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(sums));
        return sums;
    }
}