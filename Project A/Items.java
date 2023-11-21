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
    
    public int getMainWeaponsPrice0()
    {
        return mainWeapons.get(0).getPrice();
    }
    public int getMainWeaponsPrice1()
    {
        return mainWeapons.get(1).getPrice();
    }
    public int getMainWeaponsPrice2()
    {
        return mainWeapons.get(2).getPrice();
    }
    public int getMainWeaponsPrice3()
    {
        return mainWeapons.get(3).getPrice();
    }
    
    public int getSecondaryWeaponsPrice0()
    {
        return secondaryWeapons.get(0).getPrice();
    }
    public int getSecondaryWeaponsPrice1()
    {
        return secondaryWeapons.get(1).getPrice();
    }
    public int getSecondaryWeaponsPrice2()
    {
        return secondaryWeapons.get(2).getPrice();
    }
    public int getSecondaryWeaponsPrice3()
    {
        return secondaryWeapons.get(3).getPrice();
    }
    
    public int getArmorPrice0()
    {
        return armors.get(0).getPrice();
    }
    public int getArmorPrice1()
    {
        return armors.get(1).getPrice();
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