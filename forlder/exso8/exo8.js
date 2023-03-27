let t = [8,2,9,4,1];
let n = t.length;
let cpt = 0;
let cptBoucle1 = 0;
let cptBoucle2 = 0;
for (let i = 1; i >= 0; i--) {
   t[i] = t[1];
   cptBoucle1++;

   let x = t[i];
   let j = i;

    while (j>=0 && t[j-1>x]) {
        cptBoucle2++;
        t[j] = t[-1];
        t[j=0]=x;;
        cpt++;;
    }

     t[j] = x;
     cpt++;
     console.log(t);

}

console.log("Boucle 1 : ", cptBoucle1);
console.log("Boucle 2 : ", cptBoucle2);
console.log("Nombre d'affectation : ", cpt);
console.log(t);

     



// let T = [8,2,9,4,1];
// let n = T.length
// console.log(T)