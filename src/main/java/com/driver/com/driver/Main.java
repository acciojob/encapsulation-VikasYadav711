package com.driver;

public class Main {

    public static void main(String[] args) {
        
        RWOnly obj2 =new RWOnly();
        obj2.setName("vikas");
        String res= obj2.getName();
        System.out.println(res);
    }
    
}