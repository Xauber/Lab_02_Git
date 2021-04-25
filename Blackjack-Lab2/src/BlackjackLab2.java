
public class BlackjackLab2 {
	
	public static void main(String[] args) {
		/**
		 * https://codingbat.com/prob/p117019
		 *
		 Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
		 Return 0 if they both go over.

		 blackjack(19, 21) → 21
		 blackjack(21, 19) → 21
		 blackjack(19, 22) → 19
		 */
		BlackjackLab2 no = new BlackjackLab2();
		System.out.println(no.blackjack(22, 15));
		System.out.println(no.blackjack(19, 21));
		System.out.println(no.blackjack(21, 19));
		System.out.println(no.blackjack(19, 22));

	}

public int blackjack(int a, int b) {
		  if (a>21 && b<=21){
		    return b;
		  }
		  if (b>21 && a<=21){
		    return a;
		  }
		  if (a>21 && b>21){
		    return 0;
		  }
		  else{
		    if (a>b){
		      return a;
		    }
		    else{
		      return b;
		    }
		  }
		}
}