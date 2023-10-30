public class Warrior extends Character {
    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (!weapon.equals("hammer") && !weapon.equals("sword")) {
            throw new WeaponException(name + ": A " + weapon + "?? What should I do with this?!");
        }
        super.attack(weapon);
        System.out.println(name + ": I'll crush you with my " + weapon + "!");
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back like a bad boy.");
    }

}