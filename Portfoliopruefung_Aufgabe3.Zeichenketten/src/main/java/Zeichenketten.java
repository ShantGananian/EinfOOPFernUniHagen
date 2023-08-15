/*
 * Eselsuche
 */

/**
 * @author Shant Gananian
 */
public class Zeichenketten {

    public static void main(String[] args) {

        String input = "34678324532735387732984763287456438756324877353676535324873275984356437645324632098574307353985643576367655234987327432487536765632457353632874632532743248732985643763215432649832456437653287473249217403254863254452198746236532432950321463297453294703246328745329750326532";
        String str = "7353";

//        String input = "2222";
//        String str = "2";
//        String input = "735300";
//        String str = "7353";
//        String input = "735324677353007727947142661770";
//        String str = "7353";
        int index = 0, count = 0;

        for (int n = 1; n <= 100; n++) {

            int nstr = n * Integer.valueOf(str); // Für die Vielfachen der gesuchten Zahl, nachdem die Zeichenfolge in einen ganzzahligen Wert geändert wurde

            while (true) {
                index = input.indexOf(String.valueOf(nstr), index); // Suche nach dem Index in der Ziffernfolge, in dem die erste Ziffer der gesuchten Ziffernfolge vorkommt

                if (index != -1) {
                    count = count + n;
                    String nstrString = String.valueOf(nstr);
                    index++;

                } else {
                    break;
                }
            }

        }
        System.out.println("Die Anzahl der Esel: " + count);
    }

}
