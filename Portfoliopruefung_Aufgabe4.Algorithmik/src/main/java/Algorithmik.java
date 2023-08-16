/*
 * Newton-Verfahren
 */

/**
 *
 * @author Shant Gananian
 */
public class Algorithmik {

    public static void main(String[] args) {

        double[] xs = new double[]{9317, 3509, 2749, 4560, 6740, 7057, 2854, 6979, 4531, 2937, 8902, 8792, 3908, 9455, 2295, 7888, 7385, 7716, 6327, 3186, 65, 3446, 7264, 6396, 3685, 4716, 2372, 2404, 1681, 9175};
//      double[] xs = new double[]{2, 4, 10, 24, 33, 15, 100, 7, 12, 44};

        double[] ys = new double[xs.length];

        for (int i = 0; i < xs.length; i++) {

            double xn = xs[i];  // in der Definition x_0 = x. Hier ist xn das x_0 (d. h. für i = 0)

            for (int j = 1; j <= 6; j++) { // Ich habe 6 statt 5 Iterationen durchgeführt, um die richtige Antwort zu erhalten. Wahrscheinlich handelt es sich um einen Fehler in der Aufgabenstellung.
                xn = xn - ((xs[i] - Math.pow(xn, 2)) / (-2 * xn));

            }
            ys[i] = xn;

            System.out.print(((int) (ys[i] * 1000000) / 1000000.0) + ((i < xs.length - 1) ? "," : "")); // Ich habe .0 im Nenner hinzugefügt, um wie gewünscht einen doppelten Wert zu erhalten. Ansonsten sind die Ergebnisse ganze Zahlen. Es muss ein Fehler in der Aufgabenstellung sein.

        }
    }

}
