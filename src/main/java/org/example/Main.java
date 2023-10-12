package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setAbility("Physical");
        System.out.println("Boss health: " + boss.getHealth() + "\n" + "Boss damage: " + boss.getDamage() + "\n" + "Boss ability: " + boss.getAbility());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero #" + i + " health: " + heroes[i].getHealth() + ", damage: " + heroes[i].getDamage() + ", ability: " + heroes[i].getAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero heroPhysical = new Hero(250, 20, "Physical");
        Hero heroKinetic = new Hero(180, 35);
        Hero heroTor = new Hero(220, 45, "Tor");
        return new Hero[]{heroPhysical, heroKinetic, heroTor};
    }
}