import java.util.Arrays;
import java.util.List;

//Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡,
// dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.

public class WaterPokemon extends Pokemon {
    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, food, type, sound);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Surf!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "uses HydroPump against " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "uses HydroCanon against " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "uses RainDance against " + enemy.getName());
        // heeft geen effect op electic pokemon "has no effect on (vijand) en boosts grass type
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("Has no effect on " + enemy.getName());
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " gained a water boost!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
