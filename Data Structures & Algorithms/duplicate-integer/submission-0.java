class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dupl = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    dupl = true;
                    System.out.println(dupl);
                }
            }
        }
        return dupl;
    }
}