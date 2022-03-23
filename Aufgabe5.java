import java.util.*;

public class Aufgabe5 {

    public static void pingPong() throws PingPongException {

	System.out.println("PingPong aufgerufen!");
	throw new PingPongException();
    }

    public static void ping() throws PingException {

	System.out.println("Ping aufgerufen!");
	throw new PingException();
    }

    public static void pong() throws PongException {

	System.out.println("Pong aufgerufen!");
	throw new PongException();
    }

    public static void showMenu() throws PingException, PongException, PingPongException {

	System.out.println("Menue:");
	System.out.println("1 - Ping");
	System.out.println("2 - Pong");
	System.out.println("3 - PingPong");
	System.out.println("");
	System.out.println("Ihre Wahl:");

	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	s.close();

	switch (i) {

            case 1:
    	        Aufgabe5.ping();
    	        break;

    	    case 2:
    	        Aufgabe5.pong();
    	        break;

    	    case 3:
    	        Aufgabe5.pingPong();
    	        break;

    	    default:
    	        System.err.println("Eingabefehler!");
	}
    }

    public static void main(String[] args) {

	try {

	    Aufgabe5.showMenu();

	} catch (PingException ex) {

	    System.out.println("PingException aufgetreten");

	} catch (PongException ex) {

	    System.out.println("PongException aufgetreten");

	} catch (PingPongException ex) {

	    System.out.println("PingPongException aufgetreten");
	}
    }
}
