package com.company;

public class Skeleton extends Boss {

    private int Arrows;
    private int health;
    private int damage;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public int getArrows() {
        return Arrows;
    }

    public void setArrows(int arrows) {
        Arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Стрелы "+ getArrows();
    }
}
