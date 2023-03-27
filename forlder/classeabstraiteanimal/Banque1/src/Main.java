public class Main {

    public static void main(String[] args) {

        Compte c1 = new Compte("Marie", 1);
        System.out.println(c1);

        c1.depot(5000.0);
        System.out.println(c1);
        c1.retrait(500.0);
        System.out.println(c1);

        c1.depot(-5000.0); // erreur bloquée par notre test
        System.out.println(c1);

        c1.retrait(-500.0); // erreur bloquée par notre test
        System.out.println(c1);

        c1.retrait(50000.0); // erreur bloquée par notre test
        System.out.println(c1);

        Compte c2 = new Compte("Rachida", 2);
        System.out.println(c2);

        c1.virement(c2, 320.0);
        System.out.println(c1);
        System.out.println(c2);

//        c1.nom="Moi"; // erreur bloquée par private
//        c1.solde =1000000.0; // erreur bloquée private
        System.out.println(c1);



    }
}