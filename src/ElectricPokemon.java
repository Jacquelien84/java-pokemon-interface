import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿,
// dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, food, type, sound);
    }

    // Geef de Pokemon food

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses ThunderPunch!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses ElectroBall!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 25");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 35");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "water" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Thunder!");
        // geeft een hp boost aan electric pokemon (welke pokemon?)
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " gaines 10 hp");
                System.out.println(name.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses VoltTackle!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}