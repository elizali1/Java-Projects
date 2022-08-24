//In this exercise you will develop a class that represents a playing card but uses value semantics. In other words, you will override the
//hashCode() and equals() methods so that you can compare two instances of the class by the card value rather than the object's identity.
//Use two characters to represent the card (suit: S D C H value: 2 3 4 5 6 7 8 9 T J Q K A

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayingCard {
    String suit;
    String value;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PlayingCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayingCard card)) return false;
        return getSuit().equals(card.getSuit()) && getValue().equals(card.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuit(), getValue());
    }

    public List<Card> main(String[] args) {
            List<Card> myDeck = new ArrayList<>();
            Card Card1 = new Card("D", "Q");
            Card Card2 = new Card("S", "A");
            myDeck.add(Card1);
            myDeck.add(Card2);
            return myDeck;
    }
    }

