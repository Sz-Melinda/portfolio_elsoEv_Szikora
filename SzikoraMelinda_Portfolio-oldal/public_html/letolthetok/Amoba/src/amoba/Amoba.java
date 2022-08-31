
package amoba;

import java.util.Random;

public class Amoba {

    public static void main(String[] args) {
    
        Random rnd = new Random();
        int a = rnd.nextInt();
        String jel = (a > 0) ? "X" : "O";
        String sor1 = (a > 0) ? jel + " " : " " + jel;
        a = rnd.nextInt();
        jel = (a > 0) ? "X" : "O";
        String sor2 = (a > 0) ? jel + " " : " " + jel;
        System.out.println(sor1);
        System.out.println(sor2);
                
    }
    
}
