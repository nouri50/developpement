package com.afpa.www.main;
 class c2 {
    C1 c;
    int i;
    C2(int i, C1 c){
        if(c == null) this.c = new C1(i+1,this);
        else this.c = c;
        this.i = i;
    }
}

