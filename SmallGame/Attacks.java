/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallgame;
import java.util.Scanner;

/**
 *
 * @author Hubert
 */
public class Attacks {
    
    public void Fireball(MyCharacter myCharacter){
        System.out.println(myCharacter.getName() + " casted a fireball!!");
        myCharacter.setAP(myCharacter.getAP()+35);
    }
    
    public void PowerStrike(MyCharacter myCharacter){
        System.out.println(myCharacter.getName() + " hurled his sword with "
                + "great power!!");
        myCharacter.setAP(myCharacter.getAP()+15);
    }
    
    public void PrecStrike(MyCharacter myCharacter){
        System.out.println(myCharacter.getName() + " pierced with great "
                + "precision !!");
        myCharacter.setCrit(myCharacter.getCrit()+80);
    }
    
    public Attacks(MyCharacter myCharacter){
        System.out.println("\n What attack do you suggest? :");
        System.out.println("1# FIREBALL!!!");
        System.out.println("2# POWERSTRIKE!!!");
        System.out.println("3# PRECISIONSTRIKE!!!\n");
        
        Scanner sc =new Scanner(System.in);
        int myCase = sc.nextInt();
        
        switch (myCase) {
            
            case 1:  Fireball(myCharacter);
                     break;
            case 2:  PowerStrike(myCharacter);
                     break;
            case 3:  PrecStrike(myCharacter);
                     break;
        }
    }
    
    
    
}
