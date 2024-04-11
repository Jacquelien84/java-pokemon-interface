import java.util.Arrays;
import java.util.List;

// Het type fire🔥 doet de meeste schade aan grass-pokémons🌿,
// daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.

public class FirePokemon extends Pokemon {
    private static final String type = "fire";

    private static final List<String> attacks = Arrays.asList("FireLash", "FlameThrower", "PyroBall", "Inferno");
    public FirePokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, food, type, sound);
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses FireLash!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses FlameThrower!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses PyroBall against " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Inferno against " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

