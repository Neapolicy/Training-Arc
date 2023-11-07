import java.util.ArrayList;
import java.util.Random;
public class OldMaid
{
    private Player one = new Player(true);
    private Player two = new Player(true);
    private int b;
    private int i;
    public OldMaid()
    {
        replace();
        addCard();
        one.setDeck(removeDoubles(one.getDeck()));
        two.setDeck(removeDoubles(two.getDeck()));
        System.out.println(one.getDeck());
        System.out.print(two.getDeck());
    }

    public void replace()
    {
        Random rand = new Random();
        i = rand.nextInt(2);
        if (i == 1)
        {
            ArrayList<String> deck = one.getDeck();
            b = deck.size() - 1;
            deck.remove(b);
            one.setDeck(deck);
        }
        else
        {
            ArrayList<String> deck = two.getDeck();
            b = deck.size() - 1;
            deck.remove(b);
            two.setDeck(deck);
        }
        addCard();
    }
    public void addCard()
    {
        if (i == 1)
        {
            Card c = new Card();
            String val = c.getValue();
            ArrayList<String> deck = one.getDeck();
            deck.add(val);
        }
        else
        {
            Card c = new Card();
            String val = c.getValue();
            ArrayList<String> deck = two.getDeck();
            deck.add(val);
        }
    }
    public void game()
    {

    }

    public ArrayList<String> removeDoubles(ArrayList<String> deck)
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
}
