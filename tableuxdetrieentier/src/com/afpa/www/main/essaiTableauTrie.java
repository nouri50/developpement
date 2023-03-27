import com.afpa.www.main.TableauTrie;

import java.util.Scanner;
import java.util.StringTokenizer;

class EssaiTableauTrie {
    public static void main (String[] arg)  {
        boolean fini = false;
        Scanner entree = new Scanner(System.in);
        char reponse;
        String ligne;
        StringTokenizer st;
        TableauTrie tableauTrie = new TableauTrie();


        while (!fini) {
            System.out.println("i suivi des donnees a inserer\n" +
                    "ou bien s suivi des donnees a supprimer\n" +
                    "ou bien a pour affichier la liste\n" +
                    "ou bien q pour quitter");
            ligne = entree.nextLine();
            reponse = ligne.charAt(0);
            switch (reponse) {
                case 'i' :
                    st = new StringTokenizer(ligne, "i ");
                    while (st.hasMoreTokens()) {
                        try {
                            tableauTrie.inserer(Integer.parseInt(st.nextToken()));
                        }
                        catch (NumberFormatException e)  {
                            System.out.println("Mauvais format");
                        }
                    }
                    break;
                case 's' :
                    st = new StringTokenizer(ligne,"s ");
                    while (st.hasMoreTokens()) {
                        try  {
                            tableauTrie.inserer(Integer.parseInt(st.nextToken()));
                        }
                        catch (NumberFormatException e)  {
                            System.out.println("Mauvais format");
                        }
                    }
                    break;
                case 'a' :
                    System.out.println(tableauTrie);
                    break;
                case 'q' :
                    fini = true;;
                    break;
                default :
                    System.out.println("i suivi des donnees a insererer\n" +
                            "ou bien s suivi des donnees a supprimer\n" +
                            "ou bien a pour affichier la liste\n" +
                            "ou bien q pour quitter");
                    break;
            }
        }
    }
}