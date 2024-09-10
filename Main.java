import java.util.List;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner();
		String input = "if x = 5 + 3 print x";

		List<Scanner.Token> tokens = scanner.tokenize(input);

		for (Scanner.Token token : tokens){
			System.out.println(token);
		}
	}
}
