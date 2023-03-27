package com.afpa.www.bean;

public class epargnelogement extends compte {
    private boolean autorisation=false;

    
    public epargnelogement(String nom, int id,) {
        super(nom, id);

    }
    public boolean demandeAutorisattion() {
        if (!this.autorisation) {
            this.autorisation = true;
        }
        return solde;

    }


public void virementAutomatique(compte compte;double somme)
    private final boolean getsold;

    {
        if (this.getsold && somme<this.getsold()){
            compte.virement()
        }
    }
    
}