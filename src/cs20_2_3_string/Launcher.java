package cs20_2_3_string;

import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {
	
	String s = "Ostereier suchend hoppelte das Häschen durch den weißen Schnee, juchhe!";
	System.out.println(s);

	s = s.replace("den weißen Schnee", "das grüne Gras und fand etwas");
	System.out.println(s);
	
	String[] result = s.split("\\s");
	// System.out.println(Arrays.toString(result));
	
	for (int i = 0; i < result.length; i++) {
	    
	    System.out.println(result[i]);
	}
    }
}
