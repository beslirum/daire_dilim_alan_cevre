package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double yaricap=0;
    double aci=0;
    double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenizin yaricapini giriniz: ");
        yaricap=input.nextDouble();

        System.out.println("Daire diliminizin merkez acisinin olcusunu giriniz: ");
        aci=input.nextDouble();

        double alan = pi * Math.pow(yaricap,2);
        double cevre = 2 * pi * yaricap;
        double diliminAlani = (alan*aci)/360;
        System.out.println("Dairenizin tamaminin cevresi: " + cevre);
        System.out.println("Dairenizin tamaminin alani : " +alan);
        System.out.println("Daire diliminizin alani: "+diliminAlani);


    }
}
