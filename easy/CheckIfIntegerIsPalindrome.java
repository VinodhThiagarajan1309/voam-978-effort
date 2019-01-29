public static boolean isPalindrome(int x) {
    
            if(x == 0) {
    
            }
            if(x < 0 && x%10 != 0 &&  x < 2147483647) {
                String reverseStringHolder = "";
    
                String[] intToStringArr = Integer.toString(x).split("");
    
                for(String currentString : intToStringArr  ) {
                    reverseStringHolder = currentString + reverseStringHolder;
                }
    
                int reversedInt = Integer.parseInt(reverseStringHolder);
    
                if(reversedInt == x) {
                    return true;
                } else {
                    return false;
                }
    
    
            }
            return false;
    
        }