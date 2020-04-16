import java.util.Scanner;

public class Interface
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //variables
        int user_input;
        
        //intro message
        System.out.println("Welcome to Bicycle Management System");
        do
        {
            //display menu options
            System.out.println("\nPlease make a selection (1-6):");
            System.out.println("1. Login");
            System.out.println("2. Employee Look Up");
            System.out.println("3. Customer Look Up");
            System.out.println("4. Order Look Up");
            System.out.println("5. Search Inventory");
            System.out.println("6. Update Bike Price");
            System.out.println("Enter 0 to exit system");

            //take in user input
            user_input = scan.nextInt();

            //Navigate to next page according to user input
            if(user_input == 1)
                login();
            else if(user_input == 2)
                employee_lookup();
            else if(user_input == 3)
                customer_lookup();
            else if(user_input == 4)
                order_lookup();
            else if(user_input == 5)
                search_inventory();
            else if(user_input == 6)
                update_price();

        }while(user_input != 0);

        scan.close();
    }

    //function handles selection 1: Login
    public static void login()
    {
        Scanner scan1 = new Scanner (System.in);

        //variables
        String username, password, command;

        System.out.println("Username: ");
        username = scan1.nextLine();
        System.out.println("Password: ");
        password = scan1.nextLine();

        //SHOW CREDENTIALS FOR EMPLOYEE IF USERNAME AND PASSWORD MATCH SOMEONE

        System.out.println("Successfully logged in!");
        System.out.println("Please enter \"logout\" to exit");

        command = scan1.nextLine();
        if(command == "logout")
            return;

        scan1.close();
    }

    //function handles selection 2: Employee Look Up
    public static void employee_lookup()
    {

    }

    //function handles selection 3: Customer Look Up
    public static void customer_lookup()
    {

    }

    //function handles selection 4: Order Look Up
    public static void order_lookup()
    {

    }

    //function handles selection 5: Search Inventory
    public static void search_inventory()
    {

    }

    //function handles selection 6: Update Bike Price
    public static void update_price()
    {

    }
}