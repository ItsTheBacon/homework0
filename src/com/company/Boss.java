package com.company;

public class Boss extends GameEntity{
     private String  GunsType;
     private String Gunsname;
     private Object Weapon;

    public String getGunsname() {
        return Gunsname;
    }

    public void setGunsname(String gunsname) {
        Gunsname = gunsname;
    }

    public String getGunsType() {
        return GunsType;
    }

    public void setGunsType(String gunsType) {
        GunsType = gunsType;
    }
    public String printInfo(){
        return "Weapon name: "+ getGunsname() +"  Weapon type: "+ getGunsType()+ " health: "+getHealth()+" damage: "+getDamage();
    }
}
