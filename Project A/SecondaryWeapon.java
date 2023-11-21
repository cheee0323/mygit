public class SecondaryWeapon implements Item
{
    private String name;
    private int amount;
    private Type type;
    private int price;
    
    public SecondaryWeapon(String name, int amount, Type type, int price)
    {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nAmmo: " + amount + "\nType: " + type + "\nPrice: " + price;
    }
  
    public String getName()
    {
        return this.name;
    }
    
    public int getAmount()
    {
        return this.amount;
    }
    
    public Type getType()
    {
        return this.type;
    }
        
    public int getPrice()
    {
        return this.price;
    }
    
    public String printType()
    {
        switch(this.type){
            case SHOTGUN:
                return "Shotgun";
            case SNIPER:
                return "Sniper";
            case RIFLE:
                return "Rifle";
            case MACHINEGUN:
                return "Machine gun";
            case NOISEPISTOL:
                return "Noise Pistol";
            case REVOLVER:
                return "Revolver";
            case SHIELD:
                return "Shield";
            default: 
                return "";
        }
    }
}
