import java.util.Scanner;
//Needed for Database Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Interface
{
    public static void main (String [] args) throws ClassNotFoundException, SQLException
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
    @SuppressWarnings("resource")
	public static void login() throws SQLException, ClassNotFoundException
    {
        Scanner scan1 = new Scanner (System.in);

        //variables
        String username, password, command, databaseUN = null, databasePW = null;

        System.out.println("Username: ");
        username = scan1.nextLine();
        System.out.println("Password: ");
        password = scan1.nextLine();

        //SHOW CREDENTIALS FOR EMPLOYEE IF USERNAME AND PASSWORD MATCH SOMEONE
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost: 5432/postgres", "postgres", "admin");
        PreparedStatement stmt = con.prepareStatement("SELECT eUsername, ePassword FROM employees");
        ResultSet Rs = stmt.executeQuery();

        while (Rs.next())
        {
        	databaseUN = Rs.getString("username");
        	databasePW = Rs.getString("password");
        }

        if (databaseUN == username && databasePW == password) 
        {
        	System.out.println("Successfully logged in!");
        	System.out.println("Please enter \"logout\" to exit");

        	command = scan1.nextLine();
        	if(command == "logout")
        	{
        		return;
        	}
        }
        else {
        	System.out.println("Incorrect username and/or password\n");
        	System.out.println("Please re-enter login information...");
        	login();
        }

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