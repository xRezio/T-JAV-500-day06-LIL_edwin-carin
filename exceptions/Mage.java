public class Mage extends Character
{   
    private int life = 70;
    private int strength = 10;
    private int agility = 8;
    private int wit = 3;

    public Mage(String name)
    {
        super(name,"Mage");
        System.out.println(name+": May the gods be with me.");
    }
    
    @Override
    public int getLife(){
        return this.life;
    }

    @Override
    public int getStrength(){
        return this.strength;
    }

    @Override
    public int getAgility(){
        return this.agility;
    }

    @Override
    public int getWit(){
        return this.wit;
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon == null || weapon.trim().isEmpty()) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        } else if ("hammer".equals(weapon)) {
            throw new WeaponException(this.name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
        }
        super.attack(weapon);
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back furtively.");
    }
}
