class Solution {
    public boolean hasDuplicate(int[] nums) {

        
        for (int r=0 ;r < nums.length; r++){

            for (int p = r+1;p < nums.length; p++){          
            if(nums[r] == nums[p]){
                return true;
            }
            }


        }
        return false;
    }
}