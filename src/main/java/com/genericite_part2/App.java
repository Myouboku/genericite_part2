package com.genericite_part2;

public final class App {
    public static void afficherBinomes(Paire<? extends Personne> binome) {
        String personne1 = binome.getPremier().getNom() + " " + binome.getPremier().getPrenom();
        String personne2 = binome.getDeuxieme().getNom() + " " + binome.getDeuxieme().getPrenom();
        System.out.println(personne1 + " et " + personne2);
    }

    public static void main(String[] args) {
        String[] phrase = { "Bonjour", "à", "tous", "les", "amis" };
        Paire<String> resultMinMax = TableauAlg.minMax(phrase);
        System.out.println("Min: " + resultMinMax.getPremier());
        System.out.println("Max: " + resultMinMax.getDeuxieme());
        System.out.println();

        Personne personne1 = new Personne("Dupont", "Jean");
        Personne personne2 = new Personne("Durand", "Marie");
        Paire<Personne> binomePersonnes = new Paire<Personne>(personne1, personne2);

        Eleve eleve1 = new Eleve("Martin", "Pierre");
        Eleve eleve2 = new Eleve("Martin", "Paul");
        Paire<Eleve> binomeEleves = new Paire<Eleve>(eleve1, eleve2);
        afficherBinomes(binomePersonnes);
        afficherBinomes(binomeEleves);
    }
}
