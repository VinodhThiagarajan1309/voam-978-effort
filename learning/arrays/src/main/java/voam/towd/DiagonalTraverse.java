package voam.towd;

import javax.validation.constraints.Max;

public class DiagonalTraverse {

    //[[1,2,3],[4,5,6],[7,8,9]]

    public int[] findDiagonalOrder(int[][] matrix) {

        // Find the M and N of a matrix
        int m = matrix.length;
        int n = matrix[0].length;

        int mMin = 0;
        int nMin = 0;

        int mMax = matrix.length;
        int nMax = matrix[0].length;

        int mIterator = 0;
        int nIterator = 0;

        // Logic for Single Row and Single Column cases
        if(mMax == 1) {
            return matrix[0];
        } if(nMax == 1) {
            int[] result = new int[mMax];
             for (int i=0; i < mMax; i++) {
                 result[i] = matrix[i][0];
             }
            System.out.println(result);
            System.out.println("Test");
        }

        boolean slideDown = false;
        boolean slideUp = false;

        for(int i=0 ; i < m*n ; i++) {

            if(mIterator == 0 & nIterator == 0 ) {
                System.out.println(matrix[mIterator][nIterator]);
                nIterator++;
            } else {

                // Print
                System.out.println(matrix[mIterator][nIterator]);

                // Take a decision based on m and n iterators
                if(mIterator == mMin && nIterator != nMax-1) {
                    mIterator++;
                    nIterator--;
                } else if (nIterator == nMin && mIterator!= mMax && slideUp == false) {
                    mIterator++;
                    slideUp = true;

                } else if (slideUp) {
                    mIterator--;
                    nIterator++;

                    if(mIterator == mMin) {
                        slideUp = false;
                    }
                } else if (slideDown) {
                    mIterator++;
                    nIterator--;

                    if(mIterator == mMax) {
                        slideDown = false;
                    }
                    else if (nIterator == nMax-1) {
                    mIterator++;
                    slideDown = true;
                }
                }

            }




        }

        return null;
    }
}
