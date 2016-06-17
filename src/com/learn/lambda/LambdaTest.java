package com.learn.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        test2();
    }
    
   
    public static void test1()
    {
        List<String> names=Arrays.asList("he","kun","tomiyo","peintune");
         Collections.sort(names, (a,b)->a.compareTo(b));
         for(String name:names){
             System.out.println(name);
         }
    }
    
    public static void test2(){
        Converter<String, Integer> converter=(from)->Integer.valueOf(from);
        //Converter<String, Integer> convert2=(from)->System.out.println(from);
        Integer convert=converter.convert("123");
        System.out.println(convert);
    }
}
