class Card {
  private int value;
  private String suit;
  private String name;


  public Card() {
    this.name = "";
    this.suit = "";
    this.value = 0;
  }

  public Card(String name, String suit, int value) {
    this.name = name;
    this.suit = suit;
    this.value = value;
  }

  public String toString() {
    return this.name + " of " + suit;
  }
  
  public int getValue() {
    return this.value;
  }

  public String getSuit() {
    return this.suit;
  }

  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public void setValue(int value) {
    this.value = value;
  }
}