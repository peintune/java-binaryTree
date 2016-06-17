package com.learn.java8time;

import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class java8timeTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        test1();
    }
    
    public static void test1(){
        ZoneId zone1=ZoneId.of("Africa/Addis_Ababa");
        System.out.print(zone1.getRules());
    }
}
