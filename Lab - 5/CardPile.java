package coe318.lab5;
/**
 *
 * @author 
 */

import java.util.ArrayList;

/**
 * A pile of cards.
 *
 */
public class CardPile {
    //Instance variables
    private ArrayList<Card> cards = new ArrayList<Card>();

    public CardPile() {
        //Initialize the instance variable.

    }
    /**
     * Add a card to the pile.
     * @param card
     */
    public void add(Card card) {
        this.cards.add(card);
    }

    /**
     * Remove a card chosen at random from the pile.
     * @return
     */
    public Card removeRandom() {                            //because we need to randomize 52 cards in the deck, we use the Math.random() combined with 
        int num = (int)(Math.random()*this.cards.size());   //the array size of the deck being 52 cards so that it will always randomize the deck, Moreover the return
        return(this.cards.remove(num));                     //will basically remove the card from the deck and put it into yours or he houses hand. "as if the house is dealing the cards"
    }

    /**
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {                      //this basically forces an output onto the block 
        String cardList = "\n";                     //
        for(Card card : this.cards){
            cardList += card.toString() + "\n";
        }
        return cardList;
    }
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
                System.out.println(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }


}