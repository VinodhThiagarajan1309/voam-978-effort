package voam.arrays;

public class TwiceAsBig {

    public int dominantIndex(int[] nums) {

        // find the largest number first
        int largestNumber = -1;
        int largestNumberIndexHolder = -1;


        for(int i = 0 ; i < nums.length; i++) {

            if(nums[i] > largestNumber) {
                largestNumber = nums[i];
                largestNumberIndexHolder = i;
            }

        }

        for(int j : nums) {
            if(j != largestNumber && j*2 > largestNumber) {
                return -1;
            }
        }

        return largestNumberIndexHolder;
    }
}
