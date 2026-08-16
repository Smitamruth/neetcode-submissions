class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j];

                if(target == sum){
                    System.out.println("[" + i + "," + j + "]");
                    indx[0] = i;
                    indx[1] = j;

                    //Convert Array into string
                    System.out.println(Arrays.toString(indx));
                    break;
                }
            }
        }
        return indx;
    }
}
