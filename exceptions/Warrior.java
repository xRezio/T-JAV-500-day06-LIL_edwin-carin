public class Warrior extends Character
{   
    private int life = 70;
    private int strength = 10;
    private int agility = 8;
    private int wit = 3;

    public Warrior(String name)
    {
        super(name,"Warrior");
        System.out.println(name+": My name will go down in history!");
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
    } else if (!"hammer".equals(weapon)) {
        throw new WeaponException(this.name + ": A " + weapon + "?? What should I do with this?!");
    }
    super.attack(weapon);
    System.out.println(this.name + ": I'll crush you with my " + weapon + "!");
}

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back like a bad boy.");
    }
}
