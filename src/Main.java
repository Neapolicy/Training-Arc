import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> deck = new ArrayList<String>();
        Card c = new Card();
        String val = c.getValue();
        deck.add(val);
        System.out.println(c.getColor() + " " + c.getSuit() + " " + deck);
       /* Scanner s = new Scanner(System.in);
        System.out.println("Would you like to play Poker or Old Maid?");
        String answer = s.nextLine();
        answer = answer.toLowerCase();
        s.close();
        if (answer.contains("poker"))
        {
            Poker p = new Poker();
        }
        else
        {
            OldMaid mei = new OldMaid();
        }*/
    }
}