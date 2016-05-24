------------------------------------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallgame;

/**
 *
 * @author Hubert
 */
public class SmallGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MyCharacter hero = new MyCharacter();
        Enemy pingwin = new Enemy();
        Enemy wolf = new Enemy();
        Enemy bear = new Enemy();
        Enemy blackWolf = new Enemy();
        
        pingwin.setName("Penguin");
        pingwin.setHP(200);
        pingwin.setAP(3);
        wolf.setName("Wolf");
        hero.setName("Hero");
        bear.setName("Bear");
        blackWolf.setName("Black wolf");
        hero.setHP(1000);
        
        Fight firstFight = new Fight(hero,pingwin);
        Fight secFight = new Fight(hero,bear);
        Fight thirdFight = new Fight(hero,wolf);
        Fight lastFight = new Fight(hero,blackWolf);
        
    }
    
}
