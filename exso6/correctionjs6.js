let sommeUtilisateur=prompt("donne le prix :");
let message = "perdu";
let= cp = 1;

let rdm= math.floor(math.random() * 100 +1 );

while(cpt<11 && sommeUtilisateur!=rdm) {
    if (sommeUtilisateur>rdm){
        sommeUtilisateur = prompt ("trop eleve "+ cpt);
    }
    if(sommeUtilisateur==rdm){
        message = `bravo vous avez trouvé{cpt}`


    }

    cpt++;
}