package cs18_2_4_procedure;

public class Launcher {

    static void loopColumns(int i, int j) {
	
	if (j <= 10) {
	    
	    System.out.print(i * j + "\t");
	    j++;
	    Launcher.loopColumns(i, j);
	}
    }

    static void loopRows(int i) {
	
	if (i <= 10) {
	    
	    int j = 1;

	    Launcher.loopColumns(i, j);
	    System.out.println();
	    i++;
	    Launcher.loopRows(i);
	}
    }

    public static void main(String[] args) {

	int i = 1;

	Launcher.loopRows(i);
    }
}
