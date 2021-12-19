package cs20_2_4_procedure;

public class Launcher {

    static String greet(boolean evening) {
	
	String s = "Guten Tag!";
	
	if (evening == true) {
	    
	    s = "Guten Abend!";
	}
	
	return s;
    }
    
    public static void main(String[] args) {
	
	String s = null;
	
	s = Launcher.greet(false);
	System.out.println(s);
	
	s = Launcher.greet(true);
	System.out.println(s);
    }
}
