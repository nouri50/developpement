public class Main {
    public static void main(String[] args) {
        class ArdoisePile extends Box  {
            Pile1 pile = new Pile1();
            JTextField valeurAEmpiler = new JTextField(10);
            JLabel valeurDepilee = new JLabel("          ");
            JButton boutonEmpiler = new JButton("empiler");
            JButton boutonDepiler = new JButton("depiler");
            JLabel voir = new JLabel("contenu de la pile");
            JButton boutonVide = new JButton("est-elle vide ? ");
            JLabel valeurVide = new JLabel(" ");
            JLabel erreur = new JLabel("                      ");
            ArrayList<String> contenu = new ArrayList<String>();

            ArdoisePile() {
                super(BoxLayout.Y_AXIS);
                JPanel panneau;
                ActionListener empiler = new Empiler();

                // Pour ce qui concerne l'empilement
                panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
                panneau.setBackground(Color.yellow);
                panneau.add(new JLabel("Valeurs entieres a empiler  "));
                panneau.add(valeurAEmpiler);
                panneau.add(boutonEmpiler);
                valeurAEmpiler.addActionListener(empiler);
                boutonEmpiler.addActionListener(empiler);
                add(panneau);

                // Pour ce qui concerne le depilement
                panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
                panneau.setBackground(Color.yellow);
                panneau.add(boutonDepiler);
                panneau.add(new JLabel("Valeur depilee :  "));
                panneau.add(valeurDepilee);
                boutonDepiler.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        try {
                            erreur.setText(" ");
                            valeurDepilee.setText(Integer.toString(pile.depiler()));
                            erreur.setText(" ");
                            valeurVide.setText(" ");
                            contenu.remove(contenu.size() - 1);
                            afficher();
                        }
                        catch(ExceptionPileVide exc)  {
                            erreur.setText("Erreur : " + exc);
                        }
                    }
                });
                add(panneau);

                // Pour savoir si la pile est vide ou non
                panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
                panneau.setBackground(Color.yellow);
                panneau.add(boutonVide);
                panneau.add(valeurVide);
                boutonVide.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        boolean resultat = pile.estVide();
                        if (resultat) valeurVide.setText("oui");
                        else valeurVide.setText("non");
                        erreur.setText(" ");
                    }
                });
                add(panneau);

                // Pour la vision de la pile
                panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
                panneau.setBackground(Color.yellow);
                panneau.add(voir);
                add(panneau);

                // Pour ce qui concerne les messages d'erreur
                panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
                panneau.setBackground(Color.yellow);
                erreur.setForeground(Color.red);
                panneau.add(erreur);
                add(panneau);

            }

            class Empiler implements ActionListener {
                public void actionPerformed(ActionEvent evt) {
                    String texte;
                    StringTokenizer t = new StringTokenizer(valeurAEmpiler.getText());
                    while(t.hasMoreTokens())  {
                        try  {
                            erreur.setText(" ");
                            texte = t.nextToken();
                            pile.empiler(Integer.parseInt(texte));
                            contenu.add(texte);
                            afficher();
                        }
                        catch(NumberFormatException exc)  {
                            erreur.setText("Erreur : entree non valide");
                        }
                    }
                    valeurDepilee.setText(" ");
                    valeurAEmpiler.setText("");
                    valeurVide.setText(" ");
                }
            }


            void afficher() {
                String texte = "contenu de la pile : ";

                for (String valeur : contenu) texte = texte.concat(" " + valeur);
                voir.setText(texte);
            }
        }

        class InterfacePile {
            public static void main(String[] arg)  {
                JFrame fenetre = new JFrame("Essayer une pile d'entiers");
                fenetre.setContentPane(new ArdoisePile());
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fenetre.setVisible(true);
                fenetre.pack();
                fenetre.setLocation(100, 100);
            }
        }
    }
}