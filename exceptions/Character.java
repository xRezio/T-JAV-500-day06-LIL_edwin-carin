public abstract class Character implements Movable
{

    protected String name="";
    protected int life=50;
    protected int agility=2; 
    protected int strength=2;
    protected int wit=2;
    final String RPGClass;


    public Character(String name, String RPGClass)
    {
        this.name=name;
        this.RPGClass=RPGClass;
    }

    public Character(String name){
        this.name=name;
        this.RPGClass="SomethingSetByTestCharacter";
    }

    public final void unsheathe(){
        System.out.println(this.name+": unsheathes his weapon.");
    }

    public String getName()
    {
        return this.name; 
    }

    final String getRPGClass()
    {
        return this.RPGClass; 
    }

    public int getLife()
    {
        return this.life; 
    }

    public int getAgility()
    {
        return this.agility; 
    }

    public int getStrength(){
        return this.strength;
    }

    public int getWit(){
        return this.wit;
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back");        
    }

    public void attack(String weapon) throws WeaponException {
        if (weapon == null || weapon.trim().isEmpty()) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        }
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

}