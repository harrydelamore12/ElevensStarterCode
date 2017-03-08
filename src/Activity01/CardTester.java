package Activity01;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card first = new Card("Queen","Hearts",9);
                Card second = new Card("King","Spades",7);
                
                System.out.println(first);
	}
}
