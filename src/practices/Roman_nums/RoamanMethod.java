package practices.Roman_nums;

import java.util.LinkedHashMap;
import java.util.Map;

public class RoamanMethod {

    public static String romanNumConvertor(int num) {
        Map<Integer, String> romNum = new LinkedHashMap<>(Map.of(
                1, "I",
                2, "II",
                3, "III",
                4, "IV",
                5, "V",
                6, "VI",
                7, "VII",
                8, "VIII",
                9, "IX"
        ));
        romNum.put(10, "X");
        romNum.put(20, "XX");
        romNum.put(30, "XXX");
        romNum.put(40, "XL");
        romNum.put(50, "L");
        romNum.put(60, "LX");
        romNum.put(70, "LXX");
        romNum.put(80, "LXXX");
        romNum.put(90, "XC");
        romNum.put(100, "C");
        romNum.put(200, "CC");
        romNum.put(300, "CCC");
        romNum.put(400, "CD");
        romNum.put(500, "D");
        romNum.put(600, "DC");
        romNum.put(700, "DCC");
        romNum.put(800, "DCCC");
        romNum.put(900, "CM");
        romNum.put(1000, "M");
        // 2959 = 2000 + 800 + 50 + 9 = (II)CMLIX

        String s;


        String StrMult = "1";
        String StrNum = "" + num;
        for (int i = 1; i < StrNum.length(); i++) {
            StrMult += "0";
        }
        int multNum = Integer.parseInt(StrMult);


        if (num <= 0) {
            return "";
        }

        if (romNum.containsKey(num) && num <= 1000) {
            return romNum.get(num);
        } else {
            //=============================================================

            if (num < 1_000 && !romNum.containsKey(num)) {

                return romNum.get((num / multNum) * multNum) + romanNumConvertor(num % multNum);

           }else

           //===============================================================

               if (num <= 999_999){
                return "(" +  romNum.get((num - (num%multNum ))/1000) + ")" + romanNumConvertor(num % multNum);

            }
           else

            //==============================================================

                if (num <= 1_000_000 && !romNum.containsKey(num)) {
                return "(" + romNum.get(num / 1000) + ")" + romanNumConvertor(num % multNum);
            }else {
                  s = " not supported";
                }
            // ==================================================================

        }

        return s;
    }

}
