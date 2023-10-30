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
    public void attack(String attack){
        System.out.println(getName()+": Rrrrrrrrr....");
        System.out.println(getName()+": Feel the power of my "+attack+"!");
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
