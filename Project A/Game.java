import java.util.*;
import java.util.LinkedList;
public class Game
{
    private int money = 5000;
    private Items items = new Items();
    private int mainWeaponPrice = 0;
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
        System.out.println("Choose your main weapon");
        items.listMainWeapons();
        System.out.println("Choose option: 1, 2, 3, 4, 5");
        System.out.println("5 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        if (action == '1' || action == '2' || action == '3' || action == '4')
        {
            mainWeaponPrice = items.getMainWeaponPrice((int)action);
            money -= mainWeaponPrice;
            showCurrentMoney();
        }
        System.out.println("Skip\n");
        showCurrentMoney();
    }

    public void chooseSecondaryWeapon()
    {
        System.out.println("Choose your second weapon");
        items.listSecondaryWeapons();
        System.out.println("Choose option: 1, 2, 3, 4, 5");
        System.out.println("5 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        if (action == '5')
        {   
            System.out.println("You chose skip\n");
        }
        while ((action == '1' || action == '2' || action == '3' || action == '4') )
        {
            secondaryWeaponsPrice = items.getSecondaryWeaponsPrice((int)action);
            if(money >= secondaryWeaponsPrice)
            {
                money -= secondaryWeaponsPrice;
                showCurrentMoney();
                break;
            }
            else
            {
                System.out.println("Not enough money");
                showCurrentMoney();
                action = readUpperChar();
            }
        }
    }
    
    public void chooseArmor()
    {
        items.listArmors();
        System.out.println("Choose your armor");
        System.out.println("Choose option: 1, 2, 3");
        System.out.println("3 is skip");
        System.out.println("Please enter your choice: ");
        char action = readUpperChar();
        if (action == '5')
        {
            System.out.println("You chose skip\n");
        }
        while ((action == '1' || action == '2' || action == '3' || action == '4') )
        {
            armorPrice = items.getArmorPrice((int)action);
            if(money >= secondaryWeaponsPrice)
            {
                money -= armorPrice;
                showCurrentMoney();
                break;
            }
            else
            {
                System.out.println("Not enough money");
                showCurrentMoney();
                action = readUpperChar();
            }
        }
    }
    
    public void showCurrentMoney()
    {
        System.out.println("You have " + money + " left.");
    }
}