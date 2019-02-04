package voam.arrays;

public class FindPivotIndex {

    public int findPivotIndex(int[] num) {

        if(num.length == 1) {
            return 0;
        }

        int leftMostPivotIndexStorage = -10000;


        for(int i = 0 ; i < num.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0 ; j < num.length; j++) {

                 if(j < i) {
                     leftSum += num[j];
                 }

                 if(j > i) {
                     rightSum += num[j];
                 }
            }

            if (leftSum == rightSum && leftMostPivotIndexStorage == -10000) {
                return leftMostPivotIndexStorage;
            }

        }


        return -1;
    }
}
