import java.util.*;
import java.util.LinkedList;
public class Game
{
    private int money = 5000;
    private Items items = new Items();
    private int mainWeaponsPrice = 0;
    private int secondaryWeaponsPrice = 0;
    private int armorPrice = 0;
    public Game()
    {
        menu();
    }
    
    private void menu()
    {
        System.out.println("Choose option: Start, Exit");
        System.out.println("Please enter your choice S, X: ");
        char action = readUpperChar();
        while (action != 'X')
        {
            switch(action)
            {
                case 'S': 
                    System.out.println("Final Round");
                    System.out.println("\nYou have 5000");
                    chooseMainWeapon();
                    chooseSecondaryWeapon();
                    chooseArmor();
                    if ((5000 - money) < ((int)Math.random() * 5000))
                    {
                           System.out.println("You lose");
                    }
                    else
                    {
                        System.out.println("You Win");
                    }                 
                    break;
                case 'X':
                default:
        }
        System.out.println("Choose option: Start, Exit");
        System.out.println("Please enter your choice S, X: ");
        action = readUpperChar();
        } 
    }
    private char readUpperChar()
    {
        Scanner in = new Scanner(System.in);
        return in.next().toUpperCase().charAt(0);
    }
    public void chooseMainWeapon()
    {
        items.listMainWeapons();
        System.out.println("Choose your main weapon");
        System.out.println("Choose option: 1, 2, 3, 4, 5");
        System.out.println("5 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        {
            switch(action)
            {
                case '1':
                    mainWeaponsPrice = items.getMainWeaponsPrice0();
                    money -= mainWeaponsPrice;
                    
                case '2':
                    mainWeaponsPrice = items.getMainWeaponsPrice1();
                    money -= mainWeaponsPrice;
                    
                case '3':
                    mainWeaponsPrice = items.getMainWeaponsPrice2();
                    money -= mainWeaponsPrice;
          
                case '4':
                    mainWeaponsPrice = items.getMainWeaponsPrice3();
                    money -= mainWeaponsPrice;

                case '5':
                    break;
                default: 
            }
        }
        System.out.println("You have " + money + " left!\n");
    }

    public void chooseSecondaryWeapon()
    {
        items.listSecondaryWeapons();
        System.out.println("Choose your second weapon");
        System.out.println("Choose option: 1, 2, 3, 4, 5");
        System.out.println("5 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        {
            switch(action)
            {
                case '1':
                    secondaryWeaponsPrice = items.getSecondaryWeaponsPrice0();    
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else 
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseSecondaryWeapon();
                        break;
                    }
                    
                case '2':
                    secondaryWeaponsPrice = items.getSecondaryWeaponsPrice1();    
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseSecondaryWeapon();
                        break;
                    }
                    
                case '3':
                    secondaryWeaponsPrice = items.getSecondaryWeaponsPrice2();    
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseSecondaryWeapon();
                        break;
                    }
                case '4':
                    secondaryWeaponsPrice = items.getSecondaryWeaponsPrice3();    
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseSecondaryWeapon();
                        break;
                    }                    
                case '5':
                    break;
                default: 
            }
        }
        System.out.println("You have " + money + " left!\n");
    }    
    
    public void chooseArmor()
    {
        items.listArmors();
        System.out.println("Choose your armor");
        System.out.println("Choose option: 1, 2, 3");
        System.out.println("3 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        {
            switch(action)
            {
                case '1':
                    armorPrice = items.getArmorPrice0();
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseArmor();
                        break;
                    }
                case '2':
                    armorPrice = items.getArmorPrice1();
                    if ((money - secondaryWeaponsPrice) >= 0)
                    {
                        money -= secondaryWeaponsPrice;
                        break;
                    }
                    else
                    {
                        System.out.println("Not enough money");
                        System.out.println("You have " + money + " left\n");
                        chooseArmor();
                        break;
                    }    
                case '3':
                    break;
                default: 
            }
            System.out.println("You have " + money + " left\n");
        }
    }
}