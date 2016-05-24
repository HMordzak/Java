/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallgame;
//import java.util.Random;

/**
 *
 * @author Hubert
 */
public class Fight {   
    
    public void newFight(MyCharacter myCharacter,Enemy myEnemy){
        
        String charName = myCharacter.getName();
        String enemyName = myEnemy.getName();
        int charHP = myCharacter.getHP();
        int enemyHP = myEnemy.getHP();
        int charAP = myCharacter.getAP();
        int enemyAP = myEnemy.getAP();
        int charHit = myCharacter.getHit();
        int enemyHit = myEnemy.getHit();
        int charCrit = myCharacter.getCrit();
        int enemyCrit = myEnemy.getCrit();
        double rndHit;
        double rndCrit;
        
        while ((charHP > 0) && (enemyHP > 0)){
            //Char turn
            rndHit = (Math.random()*100);
            rndCrit = (Math.random()*100);
            
            if (charHit > rndHit){ 
                
                   //choose attack
                   Attacks myAttack = new Attacks(myCharacter);
                   //-------------
                   
               if (myCharacter.getCrit() > rndCrit){
                   
                   System.out.println(charName+" has " + charHP
                    + " and scored critical hit for : " + myCharacter.getAP()*2);
                   enemyHP = enemyHP - 2*myCharacter.getAP();
                   
               } else{
                   
                   System.out.println(charName + " has " + charHP +
                    " and strikes for : " + myCharacter.getAP());
                    enemyHP = enemyHP - myCharacter.getAP();
                    
               }
            } else{
                
               System.out.println(charName+" has "+charHP + "HP and missed !");
            }
           
            if (enemyHP <= 0){ break;}
           
            //Enemy turn
            rndHit = (Math.random()*100);
            rndCrit = (Math.random()*100);
           
           if (enemyHit > rndHit){
               if (enemyCrit > rndCrit){
                   System.out.println(enemyName+" has " + enemyHP
                   + " and scored critical hit for : " + enemyAP*2);
               } else{
                   System.out.println(enemyName + " has " + enemyHP +
                " and strikes for : " + enemyAP);
            
                charHP = charHP - enemyAP;
               }
           } else{
               System.out.println(enemyName+" has " +enemyHP 
                       + " and  missed!!");
           }
           
           
           myCharacter.setAP(charAP);
           myCharacter.setCrit(charCrit);
        }
        
        System.out.println( charName + " has  " + charHP);
        System.out.println( enemyName + " has " + enemyHP);
        
        myCharacter.setAP(charAP);
        myCharacter.setHP(charHP);
}

    public Fight(MyCharacter myCharacter,Enemy myEnemy){
       
        System.out.println("ITS A FIGHT BETWEEN " + myCharacter.getName()
                           + " and " + myEnemy.getName()+"\n");
        
        newFight(myCharacter,myEnemy);
        
        System.out.println(" \n FIGHT IS OVER \n");
        
    }
    
    public Fight(){
        System.out.println("There is fucking no one to figt m8!");
    }

}
