package main;

import kalkulator.Kalkulator;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int suma = Kalkulator.dodaj(a, b);
        int roznica = Kalkulator.odejmij(a, b);
        int iloczyn = Kalkulator.pomnoz(a, b);
        int iloraz = Kalkulator.podziel(a, b);

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
    }
}