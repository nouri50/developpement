package com.afpa.www.main;

public class main {
    static class Test {
        int i;
        Test(Test t) {
            if(t == null) this.i = 12;
            else{
                t.m();
                this.i = t.i;
            }
        }
        void m() {
            this.i++;
            System.out.println(this.i);
        }
        public static void main(String[] toto) {
            Test i = new Test(new Test(new Test(null)));
        }
    }


}
