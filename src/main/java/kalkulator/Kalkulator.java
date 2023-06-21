package kalkulator;

public class Kalkulator {
    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }

    public static int podziel(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Dzielenie przez zero!");
        }
    }
}