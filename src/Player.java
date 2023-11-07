import java.util.ArrayList;
public class Player {
    private ArrayList<String> deck = new ArrayList<String>();
    public Player() // player for normal poker
    {
        for (int i = 0; i  < 5; i++) {
            Card c = new Card();
            String val = c.getValue();
            deck.add(val);
            System.out.println(c.getColor() + " " + c.getSuit() + " " + c.getValue());
        }
        System.out.print(deck);
    }

    public Player(boolean b) // player for old maid
    {
        for (int i = 0; i  < 4; i++) {
            Card c = new Card();
            String val = c.getValue();
            deck.add(val);
        }
        addJoker();
    }

    private void addJoker()
    {
        Card c = new Card(true);
        String val = c.getValue();
        deck.add(val);
    }

    public ArrayList<String> getDeck()
    {
        return deck;
    }

    public void setDeck(ArrayList<String> deck)
    {
        this.deck = deck;
    }
}
