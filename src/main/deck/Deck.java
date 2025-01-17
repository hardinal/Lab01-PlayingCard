/// @author Austin Hardin
/// @version V1 17Jan25

package deck;

import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class.
 */
public class Deck
{

    /**
     * The constant NUM_CARDS.
     */
    static final int NUM_CARDS = 52;
    private Random generator;
    private ArrayList<PlayingCard> deck;

    /**
     * Instantiates a new Deck.
     */
    public Deck()
    {
        Random generator = new Random();
        initialize();
    }

    /**
     * Instantiates a new Deck.
     *
     * @param seed the seed
     */
    public Deck(int seed)
    {
        Random generator = new Random(seed);
        initialize();
    }

    /**
     * Initialize.
     */
    public void initialize()
    {
        deck = new ArrayList<PlayingCard>(NUM_CARDS);
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                deck.add(new PlayingCard(rank, suit));
            }
        }
    }

    /**
     * Shuffle deck.
     */
    public void shuffleDeck()
    {
        for(int i = deck.size() - 1; i > 0; i--)
        {

        }

    }

    /**
     * Gets card.
     *
     * @param index the index
     * @return the card
     */
    public PlayingCard getCard(int index)
    {
        return null;
    }

    @Override
    public String toString()
    {
        return " ";
    }

}
