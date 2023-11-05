import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Card {
    private String value;
    private String color;
    private String suit;
    Map<Integer, String> dictionary = new HashMap<>();
    Map<Integer, String> dictionaryTwo = new HashMap<>();
    Map<Integer, String> dictionaryThree = new HashMap<>();
    private Random rand = new Random();
    public Card() // gives you a card along with its value, suit, and color
    {
        putValues();
        putColor();
        putSuite();
        value = dictionary.get(rand.nextInt(2, 15));
        color = dictionaryTwo.get(rand.nextInt(1, 3));
        suit = dictionaryThree.get(rand.nextInt(1, 5));
    }

    public Card(boolean joker) // creates a joker
    {
        putValues();
        value = dictionary.get(15);
    }
    public void putValues() // puts in the values
    {
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");
        dictionary.put(4, "Four");
        dictionary.put(5, "Five");
        dictionary.put(6, "Six");
        dictionary.put(7, "Seven");
        dictionary.put(8, "Eight");
        dictionary.put(9, "Nine");
        dictionary.put(10, "Ten");
        dictionary.put(11, "Jack");
        dictionary.put(12, "Queen");
        dictionary.put(13, "King");
        dictionary.put(14, "Ace");
        dictionary.put(15, "Joker");
    }

    public void putColor() // gets the colors
    {
        dictionaryTwo.put(1, "Black");
        dictionaryTwo.put(2, "Red");
    }

    public void putSuite() // gets the suit
    {
        dictionaryThree.put(1, "Spades");
        dictionaryThree.put(2, "Clubs");
        dictionaryThree.put(3, "Hearts");
        dictionaryThree.put(4, "Diamonds");
    }

    public String getColor()
    {
        return color;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getValue()
    {
        return value;
    }
}
