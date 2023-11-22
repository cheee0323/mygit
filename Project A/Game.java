import java.util.*;
import java.util.LinkedList;
public class Game
{
    private int account;
    private Items items = new Items();
    private int mainWeaponPrice = 0;
    private int secondaryWeaponPrice = 0;
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
                    account = 5000;
                    System.out.println("\nYou have " + account);
                    chooseMainWeapon();
                    chooseSecondaryWeapon();
                    chooseArmor();
                    if ((5000 - account) < (Math.random() * 5000))
                    {
                        System.out.println(toString());
                        System.out.println("You lose");
                    }
                    else
                    {
                        System.out.println(toString());
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
            account -= mainWeaponPrice;
            showCurrentAccount();
        }
        System.out.println("Skip\n");
        showCurrentAccount();
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
            secondaryWeaponPrice = items.getSecondaryWeaponsPrice((int)action);
            if(account >= secondaryWeaponPrice)
            {
                account -= secondaryWeaponPrice;
                showCurrentAccount();
                break;
            }
            else
            {
                System.out.println("Not enough account");
                showCurrentAccount();
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
        if (action == '3')
        {
            System.out.println("You chose skip\n");
        }
        while ((action == '1' || action == '2') )
        {
            armorPrice = items.getArmorPrice((int)action);
            if(account >= secondaryWeaponPrice)
            {
                account -= armorPrice;
                showCurrentAccount();
                break;
            }
            else
            {
                System.out.println("Not enough account");
                showCurrentAccount();
                action = readUpperChar();
            }
        }
    }
    
    public void showCurrentAccount()
    {
        System.out.println("You have " + account + " left.");
    }
    
    public String toString()
    {
        return "You have " + account + 
        "\nPirce of main weapon that you chose is " + mainWeaponPrice +
        "\nPrice of secondary weapon that you chose is " + secondaryWeaponPrice +
        "\nPrice of armor that you chose is " + armorPrice;  
    }
}