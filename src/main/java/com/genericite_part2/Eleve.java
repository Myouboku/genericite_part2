package com.genericite_part2;

public class Eleve extends Personne {
    private double[] notes = new double[10];
    private int nbNotes = 0;

    public Eleve(String nom, String prenom) {
        super(nom, prenom);
    }

    public void ajoutNote(double note) {
        if (nbNotes < notes.length) {
            notes[nbNotes] = note;
            nbNotes++;
        }
    }
}
