package com.example.demo.controller;

public class A {
    private int age;

    private  String name;

    public  String weight;

    private  int s(int age){
        return  age;
    }

    public  String d(String name){
        return  name;
    }
    public static   Boolean valueof(boolean b){
        return b?Boolean.TRUE:Boolean.FALSE;
    }

    public A(){
      //  Map<String,List<String>> objectMap= HashMap.newInstance();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
