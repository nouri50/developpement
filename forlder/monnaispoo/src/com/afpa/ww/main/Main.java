package com.afpa.ww.main;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int total = 0;
        int reglement = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est la somme à payer : ");
        total = sc.nextInt();
        System.out.println("Le reglement du client : ");
        reglement = sc.nextInt();

        int nbrBillet10 = 0;
        int nbrBillet5 = 0;
        int nbrPiece = 0;
        int reste = reglement - total;;

        while (reste>=10){
            nbrBillet10++;
            reste = reste - 10;
        }

        if (reste>=5){
            nbrBillet5++;
            reste = reste - 5;
        }

        nbrPiece = reste;

        System.out.println(" Le reste : " + nbrBillet10 + " billet10 " +
                nbrBillet5 + " billet5 " + nbrPiece + " piece1");

        }

    }
