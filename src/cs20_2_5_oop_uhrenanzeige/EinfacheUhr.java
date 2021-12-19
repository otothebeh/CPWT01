package cs20_2_5_oop_uhrenanzeige;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EinfacheUhr {

    public static void main(String[] args) {

	System.out.println(new SimpleDateFormat(("'Es ist gerade' HH:mm 'Uhr und' ss 'Sekunden.'")).format(new Date()));
    }
}
