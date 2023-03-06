package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		if (str.charAt(0) == '\'' && str.charAt(str.length() - 1) == '\'') { // Si str empieza por ' y acaba por '
			if (str.charAt(1) == '\\') { // Si str es '\...'
				String subStr = str.substring(1, str.length() - 1); // Cogemos lo de dentro de ''
				if (subStr.length() == 2) { // Ejemplo: \n, hay que asegurarse de que no es \t \n \r
					// Es un carácter /t /r /n
					if (subStr.charAt(1) == 't') {
						return '\t';
					} else if (subStr.charAt(1) == 'r') {
						return '\r';
					} else if (subStr.charAt(1) == 'n') {
						return '\n';
					} else {
						// Es un número
						return (char) Integer.parseInt(subStr.substring(1));
					}
				} else {
					// Es un carácter normal
					return str.charAt(1);
				}
			}
		}
		// No es un carácter
		return '\0';
	}
	
}
