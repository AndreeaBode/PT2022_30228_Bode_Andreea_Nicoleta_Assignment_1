package models;

public class Monom implements Comparable<Monom> {
    private double coeficient;
    private int putere;

    public Monom(double coeficient, int putere) {
        this.coeficient = coeficient;
        this.putere = putere;
    }

    public void setCoeficient(double coef) {
        this.coeficient = coef;
    }
    public double getCoeficient() {
        return coeficient;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    @Override
    public String toString() {
        return "("+coeficient + ", " + putere+ ")";
    }

    @Override
    public int compareTo(Monom o) {
        return o.getPutere()-this.getPutere();
    }
}
