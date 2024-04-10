public abstract class Pokemon {

    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;


    public Pokemon(String name, int level, int hp, String sound, String type, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int setLevel(int level) {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

}
