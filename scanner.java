import java.util.*;
import java.util.regex.*;

public class Scanner{
	private static final String KEYWORD = "KEYWORD";
	private static final String IDENTIFIER = "IDENTIFIER";
	private static final String NUMBER = "NUMBER";
	private static final String LITERAL = "LITERAL";
	private static final String VAR_DECLARATION = "VAR_DECLARATION";
	private static final String OPERATOR = "OPERATOR";

	private static final Pattern TOKEN_REGEX = Pattern.compile(
	"\\b(if|else|while|print|for|return)\\b" + //keywords
	"|" +
	"[a-zA-Z_][a-zA-Z0-9_]*|"+               //identifiers
	"\\d+(\\.\\d+)?|"+                       //numbers	
	"\\b(true|false|null)\\b" +              //literals
	"|" +
	"\\b(let|const)\\b" +                  //variable declaration
	"|" +
	"\\b(var)\\b" + //variable declaration
	"|" 
	);

	// The tokenize method takes an input string and return a list of tokens
	//This code is part of a lexical analyzer (tokenizer) that breaks down an input string into a series of tokens based on the regular expression pattern defined in TOKEN_REGEX. 
	//Each token is classified by type and stored in a list, which is then returned for further processing, likely by a parser.
	public List<Token> tokenize(String input){
		List<Token> tokens = new ArrayList<>();
		Matcher matcher = TOKEN_REGEX.matcher(input);
		
		while (matcher.find()){
			String value = matcher.group();
			String type = getTokenType(value);
			tokens.add(new Token(type, value))
		}
		return tokens;
	}

	private String getTokenType(String value){
		if (value.matches("if|else|while|print|for|return")){
			return KEYWORD;
		} else if (value.matches("[a-zA-Z_][a-zA-Z0-9_]*")){
			return IDENTIFIER;
		} else if (value.matches("\\d+(\\.\\d+)?")){
			return NUMBER;
		} else if (value.matches("true|false|null")){
			return "LITERAL";
		} else if (value.matches("let|const")){
			return "VAR_DECLARATION";
		} else if (value.matches("var")){
			return "VAR_DECLARATION";
		} else {
			return "OPERATOR";
		}
	}

	public static class Token{
		String type;
		String value;

		Token(String type, String value){
			this.type = type;
			this.value = value;
		
		}
		@Override
		public String toString(){
			return String.format("Token(%s, '%s')", type, value);
		}
	}
}






