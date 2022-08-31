
package kalandjatek;

import java.util.Random;

public class Kalandjatek {

    public static void main(String[] args) {
     
        Random rnd = new Random();
        
        int warriorHP = 10;
        int sorcererHP = 10;
        
        
        int warriorHely = rnd.nextInt(3);  //  0 - 1 - 2
        int sorcererHely = rnd.nextInt(3);
        
        if (warriorHely == sorcererHely){
            System.out.println("Duel!");
                if(warriorHely == 0){
                    System.out.println("(|X|      )");
                }
                if(warriorHely == 1){
                    System.out.println("(   |X|   )");
                }
                if(warriorHely == 2){
                    System.out.println("(      |X|)");
                }
                
        }else{
            System.out.println("Wandering...");
        }
        
        
    }
    
}
