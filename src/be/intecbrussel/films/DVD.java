package be.intecbrussel.films;

public class DVD {
    private String titel;
    private int jaar;
    private double duur;

    public DVD(String titel, int jaar, double duur) {
        this.titel = titel;
        this.jaar = jaar;
        this.duur = duur;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public double getDuur() {
        return duur;
    }

    public void setDuur(double duur) {
        this.duur = duur;
    }

    @Override
    public String toString(){
        return getTitel()+" "+getJaar()+" "+getDuur();
    }
}
