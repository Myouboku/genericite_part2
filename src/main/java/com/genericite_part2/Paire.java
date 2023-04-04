package com.genericite_part2;

public class Paire<type> {
    private type premier;
    private type deuxieme;

    public Paire() {
        premier = null;
        deuxieme = null;
    }

    public Paire(type premier, type deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    public type getPremier() {
        return premier;
    }

    public void setPremier(type premier) {
        this.premier = premier;
    }

    public type getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(type deuxieme) {
        this.deuxieme = deuxieme;
    }
}
