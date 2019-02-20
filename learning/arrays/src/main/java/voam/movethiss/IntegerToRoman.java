package voam.movethiss;

import java.util.HashMap;

public class IntegerToRoman {

    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {

        int[] intArr = new int[String.valueOf(num).length()];
        String masterOutput = "";

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");

        int[] dividerHolder = new int[4];
        dividerHolder[3] = 1000;
        dividerHolder[2] = 100;
        dividerHolder[1] = 10;
        dividerHolder[0] = 1;

        int i = String.valueOf(num).length()-1;
        int currentNum = 0;
        int finalNumber = 0;

        while (i > 0) {
            currentNum = num;


            //System.out.println("Multiplier is " + currentNum / dividerHolder[i]);
            //System.out.println(" Divider is " + dividerHolder[i]);
            //System.out.println(" Reminder is " + currentNum % dividerHolder[i] );

            System.out.println(currentNum / dividerHolder[i] +"," + dividerHolder[i] + "," + currentNum % dividerHolder[i]);
            masterOutput = masterOutput + printer(currentNum / dividerHolder[i],dividerHolder[i] );

            num = currentNum % dividerHolder[i];

            i--;
        }

        masterOutput = masterOutput + printer(num , 1 );


        return masterOutput;
    }

    public String printer(int times , int timesOfWhat) {

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        String output = "";
        if (timesOfWhat == 1000) {

            for (int i = 0 ; i < times; i++) {
                output = output + map.get(timesOfWhat);
            }
        } else {

            //if(timesOfWhat == 100) {
                if(times >= 1 && times <= 3) {
                    for (int i = 0 ; i < times; i++) {
                        output = output + map.get(timesOfWhat);
                    }
                } else if (times == 4) {
                    output = output + map.get(timesOfWhat) + map.get(4*timesOfWhat+timesOfWhat);
                } else if (times == 5) {
                    output = output + map.get(4*timesOfWhat+timesOfWhat);
                } else if (times >=6 && times <= 8) {
                    output = output + map.get(4*timesOfWhat+timesOfWhat);// + map.get(timesOfWhat);
                    for (int i = 0 ; i < times-5; i++) {
                        output = output + map.get(timesOfWhat);
                    }
                } else if (times == 9) {
                    output = output + map.get(timesOfWhat) + map.get(timesOfWhat*10);
                }
            //}

        }
        return output;

    }
}
