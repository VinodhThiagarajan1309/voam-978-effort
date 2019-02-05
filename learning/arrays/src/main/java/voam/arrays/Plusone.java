package voam.arrays;

public class Plusone {

    public int[] plusOne(int[] digits) {
        int i = digits.length;

        boolean hasCarryOver = false;
        String resultString = "";

        while ( i > 0 ) {

            int currentValue = digits[i - 1];

            if(i == digits.length || hasCarryOver) {
                currentValue = currentValue + 1;
                if (currentValue > 9) {
                    resultString = 0 + resultString;
                    hasCarryOver = true;
                } else {
                    resultString = currentValue + resultString;
                    hasCarryOver = false;
                }
            } else {
                    resultString = currentValue + resultString;
                    hasCarryOver = false;
            }

            i--;
        }

        if(hasCarryOver) {
            resultString = "1" + resultString;
        }

        // Convert String to Array

        String[] resultArr = resultString.split("");
        int[] resultIntArr = new int[resultArr.length];
        int i2 = 0;
        for (String s : resultArr) {
            resultIntArr[i2] = Integer.parseInt(s);
            i2++;
        }

        return resultIntArr;
    }

}
