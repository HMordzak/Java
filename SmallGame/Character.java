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
public class Character {
    
    private String name;
    private int HP;
    private int AP;
    private int Hit;
    private int Crit;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param HP the HP to set
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * @param AP the AP to set
     */
    public void setAP(int AP) {
        this.AP = AP;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * @return the AP
     */
    public int getAP() {
        return AP;
    }

    /**
     * @param Hit the Hit to set
     */
    public void setHit(int Hit) {
        this.Hit = Hit;
    }

    /**
     * @return the Hit
     */
    public int getHit() {
        return Hit;
    }

    /**
     * @return the Crit
     */
    public int getCrit() {
        return Crit;
    }

    /**
     * @param Crit the Crit to set
     */
    public void setCrit(int Crit) {
        this.Crit = Crit;
    }
    
    
    
    
}
