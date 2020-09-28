package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(210);
        Weapon weapon = new Weapon();
        weapon.setWeapon("Mamochka");
        System.out.println("Information about boss" + " " +  "DAMAGE " + " " +  boss.getDamage() + " |" +  " " + "HP"
                + " " + boss.getHealth() + " " + weapon.getWeapon());
    }
}
