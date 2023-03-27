package com.afpa.www.bean;

public class TableauxTrie {
    private int capacite;
    private int increment;
    private int[] table;
    private int taille = 0; //pour le nombre d'int contenus dans table

    public TableauxTrie() {
        capacite = 10;
        increment = 3;
        table = new int[capacite];
    }
    public TableauxTrie(int capacite, int increment) {
        this.capacite = capacite;
        this.increment = increment;
        table = new int[capacite];
    }

    public void inserer(int entier) {
        int i;

        if (taille == capacite) {  //on agrandit le tableau  ;
            capacite += increment;
            int[] grandTableau = new int[capacite];
            for (i = 0; i < taille; i++) grandTableau[i] = table[i];
            table = grandTableau;
        }
        i = taille - 1;
        while ((i >= 0) && (table[i] > entier))
        {
            table[i + 1] = table[i];
            i--;
        }
        System.out.println(table.length);
        table[i + 1] = entier;
        taille++;
    }

    public void supprimer(int entier) {
        int i = 0;

        while((i < taille) && (table[i] != entier)) i++;
        if ( i< taille)  {
            while (i<taille-1)  {
                table[i]=table[i+1];
                i++;
            }
            taille--;
            if (taille == capacite - 2*increment)  //on diminue le tableau
            {
                capacite -= increment;
                int[] petitTableau = new int[capacite];
                for (i = 0; i < taille; i++) petitTableau[i] = table[i];
                table = petitTableau;
            }
        }
    }

    public String toString() {
        String chaine="";

        for (int i = 0 ;i < taille; i++)
            chaine = chaine.concat(Integer.toString(table[i]) + " ");
        return chaine;
    }

    public void  afficher() {
        System.out.println(this);
    }
}




