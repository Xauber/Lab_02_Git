
public class BlackjackAmelie {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackjackAmelie no = new BlackjackAmelie();
		System.out.println(no.blackjack(22, 15));
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