
class Main {
  public static void main(String[] args) {
	Card one = new Card("Ace", "Dimonds");
	System.out.println(one.getFace());
	System.out.println(one.toString());
	one.setValue(12);
	System.out.println("Setting new value...");
	System.out.println(one.toString());
	one.setSuit("Spades");
	System.out.println(one.toString());


  }
}