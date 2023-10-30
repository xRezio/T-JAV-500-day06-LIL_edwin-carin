public abstract class Character implements Movable{
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

        @Override
    public void moveRight() {
        System.out.println(name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back");
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public abstract void attack(String weapon) throws WeaponException;

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    public final void unsheathe() {
        System.out.println(name + ": unsheathes his weapon.");
    }

}

class TestCharacter extends Character {
    public TestCharacter(String name) {
        super(name, "SomethingSetByTestCharacter");
    }
}
