package com.genericite_part2;

public final class App {
    public static void main(String[] args) {
        String[] phrase = { "Bonjour", "à", "tous", "les", "amis" };
        Paire<String> resultMinMax = TableauAlg.minMax(phrase);
        System.out.println("Min: " + resultMinMax.getPremier());
        System.out.println("Max: " + resultMinMax.getDeuxieme());
    }
}
