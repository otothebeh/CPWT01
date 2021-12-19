package cs16_2_3_procedure_stringbuffer;

public class Launcher {

    static void testString(int max) {

	String s = ""; // String s = new String("");
	long begin = System.currentTimeMillis();

	for (int j = 0; j < max; j++) {

	    s = s + "x";
	}

	long end = System.currentTimeMillis();
	System.out.println("String: " + (end - begin));
    }

    static void testStringBuilder(int max) {

	StringBuilder sb = new StringBuilder();
	long begin = System.currentTimeMillis();

	for (int j = 0; j < max; j++) {

	    sb.append("x");
	}

	long end = System.currentTimeMillis();
	System.out.println("String: " + (end - begin));
    }

    static void testStringBuffer(int max) {
	
	StringBuffer sb = new StringBuffer();
	long begin = System.currentTimeMillis();
	
	for (int j = 0; j < max; j++) {
	    
	    sb.append("x");
	}

	long end = System.currentTimeMillis();
	System.out.println("String: " + (end - begin));
    }

    public static void main(String[] args) {
	
	String cmd = args[0];
	int max = Integer.valueOf(args[1]);

	if (cmd.equals("String")) {
	    
	    Launcher.testString(max);
	
	} else if (cmd.equals("StringBuilder")) {
	    
    	    Launcher.testStringBuilder(max);
	
	} else if (cmd.equals("StringBuffer")) {
	    
    	    Launcher.testStringBuffer(max);
	}
    }
}
