
let sommeUtilisateur = prompt("Donnez le prix : ");

let message = "perdu";

let cpt = 1;

let rdm = Math.floor(Math.random() * 100 + 1);

if(sommeUtilisateur==rdm){
    message = "Bravo vous avez trouvé " + cpt
}

while(cpt<11 && sommeUtilisateur!=rdm ){
    if(sommeUtilisateur>rdm){
        sommeUtilisateur = prompt("Trop élevé " + cpt);
    } else if(sommeUtilisateur<rdm){
        sommeUtilisateur = prompt("Trop bas " + cpt);
    }

    if(sommeUtilisateur==rdm){
        message = "Bravo vous avez trouvé " + cpt
    }

    cpt++;
}


console.log(message);
