/// @author Austin Hardin
/// @version V1 17Jan25
///
package deck;

/**
 * The Playing card class.
 */
public class PlayingCard
{
    private Rank rank;
    private Suit suit;

    /**
     * Playing card constructor.
     *
     * @param rank the rank
     * @param suit the suit
     */
    public PlayingCard(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Gets rank.
     *
     * @return the rank
     */
    public Rank getRank()
    {
        return rank;
    }

    /**
     * Gets suit.
     *
     * @return the suit
     */
    public Suit getSuit()
    {
        return suit;
    }

    /**
     * Sets rank.
     *
     * @param rank the rank
     */
    public void setRank(Rank rank)
    {
        this.rank = rank;
    }

    /**
     * Sets suit.
     *
     * @param suit the suit
     */
    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    @Override
    public String toString()
    {

        return String.format("%s of %s", rank, suit);
    }


}
