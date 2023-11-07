import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class OldMaid
{
    private Player one = new Player(true);
    private Player two = new Player(true);
    private final Scanner s = new Scanner(System.in);
    private int choice;
    private String picked;
    private int b;
    private int i;
    public OldMaid()
    {
        replace();
        addCard();
        one.setDeck(removeDoubles(one.getDeck()));
        two.setDeck(removeDoubles(two.getDeck()));
        game();
    }

    public void replace()
    {
        Random rand = new Random();
        i = rand.nextInt(2);
        if (i == 1)
        {
            b = one.getDeck().size() - 1;
            one.getDeck().remove(b);
            one.setDeck(one.getDeck());
        }
        else
        {
            b = two.getDeck().size() - 1;
            two.getDeck().remove(b);
            two.setDeck(two.getDeck());
        }
        addCard();
    }
    public void addCard()
    {
        if (i == 1)
        {
            Card c = new Card();
            String val = c.getValue();
            one.getDeck().add(val);
        }
        else
        {
            Card c = new Card();
            String val = c.getValue();
            two.getDeck().add(val);
        }
    }
    public void game() {
        while (!one.getDeck().isEmpty() && !two.getDeck().isEmpty())
        {
            System.out.println("Player one, this is your deck: " + (one.getDeck()));
            pickCard();
            removeCard(choice, "one");
            addCard(picked);
            System.out.println("Player two, this is your deck: " + (two.getDeck())); // player one turn end
            pickCard("two");
            removeCard(choice, "two");  // player two turn end, back to player one
        }
    }
    public void pickCard() // picks a card, for player one
    {
        System.out.println("Player one, your turn, player two has " + (two.getDeck().size()) + " cards");
        System.out.println("Which card will you pick?");
        choice = s.nextInt();
        limitTest(choice, (two.getDeck().size()));
    }
    public void addCard(String cardVal)
    {
        for (String val: one.getDeck())
        {
            if (cardVal.equals(val))
            {
                one.getDeck().remove(val);
                one.getDeck().remove(cardVal);
            }
            else
            {
                one.getDeck().add(cardVal);
            }
        }
    }

    public void pickCard(String p2) //pick card but for player two instead
    {
        System.out.println("Player two, your turn, player one has " + (one.getDeck().size()) + " cards");
        System.out.println("Which card will you pick?");
        choice = s.nextInt();
        limitTest(choice, (one.getDeck().size()));
    }

    public void limitTest(int choice, int length) // if the number they chose is bigger than the opponents hand, forces then to retry
    {
        while (choice > length)
        {
            System.out.println("Invalid option, please try again");
            choice = s.nextInt();
        }
    }
    public void removeCard(int i, String player) //removes a card from the opposing deck
    {
        if (player.equals("one")) // player one removes a card from player 2
        {
            picked = two.getDeck().get(i - 1);
            two.getDeck().remove(i - 1);
        }
        else // and vice versa!
        {
            picked = one.getDeck().get(i - 1);
            one.getDeck().remove(i - 1);
        }
    }
    public ArrayList<String> removeDoubles(ArrayList<String> deck) // gets rid of any duplicate cards
    {
        ArrayList<String> actualList = new ArrayList<String>();
        for (String element : deck)
        {
            if (!actualList.contains(element))
            {
                actualList.add(element);
            }
        }
        return actualList;
    }
    // layout for removing cards for realsies: check the value of the card that you draw
    // iterate through a list that compares value of card that you just drew
    // if the values match, remove the cards, else, don't
}
