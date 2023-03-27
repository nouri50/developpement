package com.afpa.www.bean;

public class lelivreA extends compte {
   private double taux=0;

   public lelivreA(String nom , int id double taux,){
       super(nom,id);
       this.taux=taux;
   }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
    public void interAnnel(){
       double sold = super.getsold();
       sold=sold * this.taux;
       this.depot(sold);
    }

    public void virement
}

