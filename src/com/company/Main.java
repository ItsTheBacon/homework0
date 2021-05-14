package com.company;

public class Main {


    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(26);
        boss.setGunsname("PT 822");
        boss.setGunsType("Огнестрельное");

        System.out.println("Boss health:" + " " + boss.getHealth() + ", " + "Boss damage:" + " " + boss.getDamage() + ", " + "Weapon type:" + " " + boss.getGunsType() + ", " + "Weapon name: " + boss.getGunsname());
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(250);
        skeleton.setDamage(23);
        skeleton.setGunsname("ЛУК");
        skeleton.setGunsType("Стрелы");
        skeleton.setArrows(12);
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(330);
        skeleton2.setDamage(63);
        skeleton2.setGunsname("ЛУК");
        skeleton2.setGunsType("Стрелы");
        skeleton2.setArrows(10);
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton2.printInfo());
    }


}
