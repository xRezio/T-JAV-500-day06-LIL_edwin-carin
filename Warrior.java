public class Warrior extends Character
{   
    private int life = 100;
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
    public void attack(String attack){
        System.out.println(getName()+": Rrrrrrrrr....");
        System.out.println(getName()+": I'll crush you with my "+attack+"!");
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
