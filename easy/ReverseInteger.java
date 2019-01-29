
class ReverseInteger {

	public static int reverse(int x) {

        try {

            if (x > -2147483648 && x < 2147483647) {

                if (x != 0) {
                    // Boolean is negative
                    boolean isNegative = false;

                    if (x < 0) {
                        isNegative = true;
                    }


                    String[] inputToString = Integer.toString(x).split("");

                    String iteratedReverseString = "";
                    for (int i = 0; i < inputToString.length; i++) {
                        iteratedReverseString = inputToString[i] + iteratedReverseString;
                    }


                    if (isNegative) {
                        iteratedReverseString = iteratedReverseString.substring(0, iteratedReverseString.length() - 1);
                        return -1 * Integer.parseInt(iteratedReverseString);
                    }

                    System.out.println("done" + Integer.parseInt(iteratedReverseString));

                    return Integer.parseInt(iteratedReverseString);
                }
            }
        } catch (NumberFormatException nfe) {
            return 0;
        }

        return 0;
    }
}