import java.util.*;
public class AccountSetup

{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.next();
        System.out.print("Enter a password that is at least 8 characters: ");
        String pass = input.next();

        int length = pass.length();
        
        while (length < 8){
            System.out.print("Enter a password that is at least 8 characters: ");
            pass = input.next();
            length = pass.length();
        }

        String lowusername = username.toLowerCase();
        String lowpass = pass.toLowerCase();

        input.close();
        System.out.println("Your username is " + lowusername + " and your password is " + lowpass);

    }
}       