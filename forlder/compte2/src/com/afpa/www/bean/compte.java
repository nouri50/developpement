package com.afpa.www.bean;

public class compte {
    private final String nom;
    private String NOM;
private  int id;

private double sold;


    public compte(String nom, int id) {
        this.nom=nom;
        this.id=id;
    }

public compte (){
}

    protected static void virement() {
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }
}

    public void depot() {
    depot(0.0);
}

    public void depot(double depot) {

    }

}