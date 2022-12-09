import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Bob, Marley, Peter, Tosh, Freddy, Mugabeh, Mandela");
		while (tokenizer.hasMoreElements()) {
			Object object = (Object) tokenizer.nextElement();
			System.out.println("Printing the next element..." +object);			
		}while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken() + "Printing the next token...");
		}		
	}

}
