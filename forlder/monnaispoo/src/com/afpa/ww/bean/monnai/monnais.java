package com.afpa.ww.bean.monnai;

public class monnais{
private int total ;
private int reglement;

    public monnais(int total,int Reglement) {
        this.total = total;
        this .reglement =reglement ;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getReglement() {
        return reglement;
    }

    public void setReglement(int reglement) {
        this.reglement = reglement;
    }
}
