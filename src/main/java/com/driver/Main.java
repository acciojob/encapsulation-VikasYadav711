package com.driver;

public class Main {

    public static void main(String[] args) {
        
        RWOnly obj2 =new RWOnly();
        obj2.setter(10);
        int res= obj2.getter();
        System.out.println(res);
    }
    
}