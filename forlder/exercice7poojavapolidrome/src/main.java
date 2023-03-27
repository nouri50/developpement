package.com.afpa.www.main;
package palindrome;


public class main {

    public static void main(String[] args) {
        String str = args[0];
        String inv = Palindrome.inverse(str);
        if (str.equals(inv)){
            System.out.println("oui palindrome");
        } else {
            System.out.println("non palindrome");
        }
    }

    }

}
