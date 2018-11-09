package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Testmain {
    public static void main(String[] args) {
        List list=new ArrayList();
        for(int i=0;i<5;i++){
            System.out.println(i);
            list.add(i);
        }

        for(Object O:list){
            System.out.println(O);
        }


    }
}
