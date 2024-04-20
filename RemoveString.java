import java.util.*;
public class RemoveString 
{
    public static void main (String[]main)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a string: ");
        String word = input.next();

        if (sentence.contains(word)){
            String newSentence = sentence.replace(word," ");
            System.out.println(newSentence);
        }else{
            System.out.println("error");
        }
        input.close();
    }
}
