package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String name;
    private int maxHP;
    private int currentHP;
    private int maxDMG;
    private int minDMG;
    private int DMG;

    // TODO: Add the rest of the properties
    // TODO: Generate/create getters and setters for these properties

    /**
     * @return true if hp is <= 0, else false
     */
    public boolean isDead() {
        return currentHP <= 0;
    }

    /**
     * Generates a random value between min. damage and max. damage and deals it to the enemy.
     *
     * @param enemy Enemy gladiator
     */
    public void dealDamage(Gladiator enemy) {
        Random ran = new Random();
        setDMG(ran.nextInt(minDMG) + maxDMG);
        enemy.setCurrentHP(enemy.getCurrentHP()-DMG);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHP() {
        return currentHP;
    }
    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    public int getDMG() {
        return DMG;
    }
    public void setDMG(int DMG) {
        this.DMG = DMG;
    }

    public int getMaxDMG(){
        return maxDMG;
    }
    public void setMaxDMG(int maxDMG) {
        this.maxDMG = maxDMG;
    }

    public int getMinDMG() {
        return minDMG;
    }
    public void setMinDMG(int minDMG) {
        this.minDMG = minDMG;
    }
}
