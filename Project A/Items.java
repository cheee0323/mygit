import java.util.LinkedList;
public class Items
{
    private LinkedList<Item> mainWeapons = new LinkedList<Item>();
    private LinkedList<Item> secondaryWeapons = new LinkedList<Item>();
    private LinkedList<Item> armors = new LinkedList<Item>(); 
    public Items()
    {
        mainWeapons.add(new MainWeapon("Judge", 5, Type.SHOTGUN, 1850));
        mainWeapons.add(new MainWeapon("Vandal", 25, Type.RIFLE, 2900));
        mainWeapons.add(new MainWeapon("Odin", 100, Type.MACHINEGUN, 3200));
        mainWeapons.add(new MainWeapon("Operator", 5, Type.SNIPER, 4700));
        
        secondaryWeapons.add(new SecondaryWeapon("Shorty", 2, Type.SHOTGUN, 300));
        secondaryWeapons.add(new SecondaryWeapon("Frenzy", 13, Type.RIFLE, 450));
        secondaryWeapons.add(new SecondaryWeapon("Ghost", 12, Type.NOISEPISTOL, 500));
        secondaryWeapons.add(new SecondaryWeapon("Classic", 6, Type.REVOLVER, 800));
        
        armors.add(new Armor("Light Shield", 25, Type.SHIELD, 400));
        armors.add(new Armor("Heavy Shield", 50, Type.SHIELD, 1000));
    }
    
    public int getMainWeaponPrice(int i)
    {
        return mainWeapons.get(i-49).getPrice();
    }
    
    public int getSecondaryWeaponsPrice(int i)
    {
        return secondaryWeapons.get(i-49).getPrice();
    }
    
    public int getArmorPrice(int i)
    {
        return armors.get(i-49).getPrice();
    }

    public void listMainWeapons()
    {
        for (Item current : mainWeapons)
        {
            System.out.println(current.toString() + "\n");
        }
    }
    
    public void listSecondaryWeapons()
    {
        for (Item current : secondaryWeapons)
        {
            System.out.println(current.toString() + "\n");
        }
    }
    
    public void listArmors()
    {
        for (Item current : armors)
        {
            System.out.println(current.toString() + "\n");
        }
    }
}