package cs18_1_2_array_asciiart;

public class Launcher {

    public static void main(String[] args) {

	String text = "TEST blübla";

	if (args.length == 1) {

	    text = args[0];
	}

	text = text.toLowerCase();

	print(text);
    }

    static void print(String s) {

	char start = 'a';
	char c = '\0';
	int index = -1;

	for (int line = 0; line < Alphabet.letters[0].length; line++) {

	    for (int i = 0; i < s.length(); i++) {

		c = s.charAt(i);
		index = c - start;
		
		if ((index >= 0) && (index <= 25)) {
		    
		    System.out.print(Alphabet.letters[index][line] + " ");
		
		} else if (c == ' ') {

		    System.out.print("    ");
		}
	    }

	    System.out.println();
	}
    }
}
