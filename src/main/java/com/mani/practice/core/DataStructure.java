package com.mani.practice.core;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class DataStructure
{
    List<String> list = new ArrayList<>();//initial capacity 10;
    Hashtable hashtable = new Hashtable(); //initial capacity 11
    HashMap hashMap = new HashMap();    // initial capacity 16
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(); //initial capacity 16

    HashSet set = new HashSet(); //16



    List list1 = new LinkedList(); //0

    public static void main(String[] args)
    {
        System.out.println( new BigDecimal(2.0).subtract( new BigDecimal(1.10),
                new MathContext(4))
        );

        System.out.println( new BigDecimal("2.00").subtract( new BigDecimal("1.10")));


        BigDecimal decimal1 = new BigDecimal(2.00,new MathContext(3));
        BigDecimal decimal2 = new BigDecimal(1.10,new MathContext(3));

        System.out.println(decimal1.subtract(decimal2));


        final String pig = "length :10";
        final String dog = "length :"+pig.length();

        System.out.println(pig==dog);
        System.out.println(pig.equals(dog));


        //Pattern pattern = Pattern.compile("(aa|aab?)+");
        Pattern pattern = Pattern.compile("(aab?)+");

        int count=0;

        for (String s=""; s.length()<200;s += "a")
        {
           if(pattern.matcher(s).matches());
            count++;
        }
        System.out.println(count);


        System.out.println('a'+1);

        System.out.println(2 & 2);//check this put

        //System.out.println(12345 + 54321);
        System.out.println(12345 + 5432l);
        System.out.println(01234 + 43210);

        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.00000")));


        Map<String,String> map = new HashMap<>();
        map.put("mani","dubey");

//        EnumMap enumMap = new EnumMap(map);
    }
}
