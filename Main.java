class Main {

  static String [] cards;
  static int NUM_OF_CARDS = 52;
  static int pos_in_deck =0;

  public static void main(String[] args) {
    
    Card c1 = new Card("Ace", "Diamonds", 1);
    Card c2 = new Card("King", "Spaces", 10);
    Card c3 = new Card("Two", "Diamonds", 2);
    System.out.println(c1);
    System.out.println(c1.getValue() + c2.getValue());
    //run();

    Deck d1 = new Deck();
    d1.displayCards();
  }

  public static void run() {
    createDeck();

    for (int i =0; i < 100; i ++) 
      shuffleDeck();

    deal(10);
    System.out.println("deal again");
    deal(15);
    //displayDeck();
  }

  public static void createDeck() {
    cards = new String[52];
    String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String [] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int count = 0;
    for (int i=0; i < values.length; i++) {
      for (int j=0; j < suits.length; j++) {
          String card = values[i] + " of " + suits[j];
          cards[count] = card;
          count++;
      }
    }
  
  }

  public static void shuffleDeck() {
    System.out.println("shuffling...");
    for (int i =0; i < NUM_OF_CARDS; i ++) {
      String card = cards[i];
      int randNum = (int) Math.floor(Math.random()* NUM_OF_CARDS);
      System.out.println(randNum);
      cards[i] = cards[randNum];
      cards[randNum] = card;
    }
  }

  public static void deal(int num) {
    // you'd have to create a check to make sure the pos_in_deck is not greater than NUM_OF_CARDS

     for (int i=pos_in_deck; i < pos_in_deck+num; i ++) {
       System.out.println(cards[i]);
     }
     pos_in_deck+= num;

  }

  public static void displayDeck() {
    for (String card: cards) {
      System.out.println(card);
    }
  }



}