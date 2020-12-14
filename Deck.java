public class Deck {

  private Card[] cards;

  public Deck() {
    cards = new Card[52];
    String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String [] names = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    int count = 0;
    for (int i=0; i < names.length; i++) {
      for (int j=0; j < suits.length; j++) {
          cards[count] = new Card(names[i], suits[j], values[i]);
          count++;
      } // for j
    } // for i
  } // constructor

  public void displayCards() {
     for (Card card: cards) {
      System.out.println(card);
    }
  }
} //class