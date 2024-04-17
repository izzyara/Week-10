import java.util.*;
public class Monogram 
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.next();
        System.out.print("Enter your middle initial: ");
        String mid = input.next();
        System.out.print("Enter your last name: ");
        String last = input.next();
        input.close();

        String initial1 = name.substring(0,1);
        String initial2 = mid.substring(0,1);
        String initial3 = last.substring(0,1);

        String mononame = initial1.toLowerCase();
        String monomid = initial2.toLowerCase();
        String monolast = initial3.toUpperCase();

        System.out.println("Your monogram is: " + mononame + monomid + monolast);

    }
}
