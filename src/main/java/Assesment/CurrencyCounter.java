package Assesment;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyCounter {

        /*
         * Complete the 'countCounterfeit' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING_ARRAY serialNumber as parameter.
         * Company - CO
         */

        public static int countCounterfeit(List<String> serialNumber) {
            // Write your code here
            int amount =0;

            for(int i=0;i<serialNumber.size();i++)
            {
                String currentSerial = serialNumber.get(i);
                Pattern p = Pattern.compile("[A-Z]{3}\\.?\\d{4}(\\d{2,4})\\w{1}");
                Matcher m = p.matcher(currentSerial);
                if(currentSerial.length()< 10 && currentSerial.length()>12)

                    return 0;

                if(m.find())
                {

                    if(currentSerial.length()>=10 && currentSerial.length()<= 12)
                    {
                        System.out.println("Current Serial :" + currentSerial);
                        char first = currentSerial.charAt(0);
                        char second = currentSerial.charAt(1);
                        char third = currentSerial.charAt(2);
                        HashSet<Character> distinct = new HashSet<>();
                        distinct.add(first);
                        distinct.add(second);
                        distinct.add(third);
                        if(distinct.size()==3 && (Character.isUpperCase(first) && Character.isUpperCase(second) && Character.isUpperCase(third)))
                        {
                            //    String restOfString = currentSerial.substring(3);
                            //    System.out.println(restOfString);
                            if(Character.isAlphabetic(currentSerial.charAt(3)) != true)
                            {
                                String year = currentSerial.substring(3,7);
                                Integer yearinInt = Integer.valueOf(year);
                                System.out.println("YEAR " + yearinInt);

                                if(yearinInt >=1900 && yearinInt <=2019)
                                {
                                    String currencyStr = currentSerial.substring(7,currentSerial.length()-1);
                                    Integer currencyInt= Integer.valueOf(currencyStr);
                                    System.out.println("CURRENCY " + currencyInt);
                                    if(currencyInt==10 || currencyInt==20 || currencyInt==50|| currencyInt==100|| currencyInt==200|| currencyInt==500|| currencyInt==1000)
                                    {

                                        if(Character.isUpperCase(currentSerial.charAt(currentSerial.length()-1)))
                                        {
                                            amount=amount+currencyInt;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }

            }
            return amount;
        }


    }
