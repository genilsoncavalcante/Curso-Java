package com.letscode.genilson;

import com.letscode.genilson.Aula02.DaysOfWeek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println(Math.PI);
        System.out.println(DaysOfWeek.Saturday);

        Scanner entrada = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("Informe a area 1:");
        double area1 = entrada.nextDouble();
        System.out.println("Agora informe a area 2:");
        double area2 = entrada.nextDouble();

        System.out.println("A área do quadrado é: " + (area1 * area2));

        System.out.println("+++++++++++++++++++++++++");
    }
}
