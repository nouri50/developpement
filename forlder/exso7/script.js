let t=[8,2,9,4,1]


function triBulles (t){

let n = t.length

for (let i = 0; i < n; i++) {
    for (let j = 0; j < n-1; j++) {
        if (t[j]>t[j+1]){
        let change = t[j]
        t[j] = t[j+1]
        t[j+1] = change
        }
    }
    
}

}
triBulles(t)
console.log(t)