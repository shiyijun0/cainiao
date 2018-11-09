package com.example.demo.controller;

class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);
        int h=3<<400000;
        System.out.println("youzi:"+h);

        if(3 >8) System.out.println("df");
        else System.out.println("890");

        switch ("8"){
            case "7":
                System.out.println(7);
                break;
            case  "8":
                System.out.println(8);
                break;
            default:
                System.out.println(0);
        }
        int r=4;
       /* while (r>0){
            r--;
            System.out.println(r);
        }*/

        do {
            r--;
            System.out.println(r);
        }while (r>0);



    }
}
