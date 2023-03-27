
let nombreAleatoire = Math.floor(Math.random()* 100) + 1;
let tentatives = 10;

for (let i = 0; i < tentatives; i++) {
    let essai = prompt("Entrez votre essai : ");
    if (essai == nombreAleatoire) {
        alert("Bravo ! Vous avez deviné le nombre en " + (i+1) + " tentatives.");
        break;
    } else if (essai < nombreAleatoire) {
        alert("Le nombre est plus grand.");
    } else {
        alert("Le nombre est plus petit.");
    }
}

if (essai != nombreAleatoire) {
    alert("vous n'avez pas reussi " + nombreAleatoire);
}