public class Mage extends Character implements Movable {
    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon == null || weapon.trim().isEmpty()) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        } else if (!weapon.equals("magic")) {
            throw new WeaponException(this.name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
        }
        super.attack(weapon);
        System.out.println(this.name + ": Feel the power of my " + weapon + "!");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }
}