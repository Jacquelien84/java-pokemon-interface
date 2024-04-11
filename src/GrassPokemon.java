import java.util.Arrays;
import java.util.List;

//Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥,
// dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";

    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, food, type, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses LeafStorm!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses SolarBeam!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses LeechSeed!");
        // trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                System.out.println(name.getName() + " gaines 40 hp");
                enemy.setHp(enemy.getHp() - 40);
                enemy.setHp(enemy.getHp() + 40);

            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                System.out.println(name.getName() + " gaines 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                enemy.setHp(enemy.getHp() + 30);

            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                System.out.println(name.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                enemy.setHp(enemy.getHp() + 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                System.out.println(name.getName() + " gaines 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                enemy.setHp(enemy.getHp() + 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses LeaveBlade!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("It's super effective." + enemy.getName() + " loses hp 40");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses hp 30");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses hp 10");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses hp 20");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}