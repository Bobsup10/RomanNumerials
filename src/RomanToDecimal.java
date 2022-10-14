/**
 * Roman Numeral Translator
 * @version 10/11/22
 * @author 24rossilli
 */

public class RomanToDecimal {
    /**
     * Identifies all roman numerals with their numerical value
     * @param roman
     * @return -1 if is not real roman numeral
     */
    public static int romanToDecimal(String roman)    {
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        //"XI".Length() => 2
        // "MCMLXII".lwngth() => 7
        // "HAHA" ==> -1
        // "xliv"
        // 0123456
        // len(roman)
        // string.length()
        // array.length
        // list.size()
        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I')
                sum += 1;
            else if(roman.charAt(i) == 'V')
                sum += 5;
            else if(roman.charAt(i) == 'X')
                sum += 10;
            else if(roman.charAt(i) == 'L')
                sum += 50;
            else if(roman.charAt(i) == 'C')
                sum += 100;
            else if(roman.charAt(i) == 'D')
                sum += 500;
            else if(roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;

        }
        //INVARIANTS
        /**
         * identifies invariants and makes them the correct value
         */
        if (roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;

    }

    /**
     * Main method for class RomanToDecimal
     * @param args
     */

    public static void main(String[] args) {
        for (String roman : args)   {   // for-each
            int decimal = romanToDecimal(roman);
            if (decimal != -1)
                System.out.println("Input: " + roman + " => output: " + decimal);
            else
                System.out.println("Input: " + roman + " => output: invalid ") ;
        }
       /* System.out.println(romanToDecimal("XI"));
        System.out.println(romanToDecimal("IX"));
        System.out.println(romanToDecimal("VIIXII"));
        System.out.println(romanToDecimal("xi"));
        System.out.println(romanToDecimal("your mom"));
        */
    }
}
