/**
 * Beschreibung der Klasse Klasse1.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe1.paket1;

public class Klasse1 {
    private static int privatesFeld = 0;
    protected static int geschuetztesFeld = 1;
    public static int oeffentlichedFeld = 2;
    static int standardFeld = 3;

    public Klasse1() {
        System.out.println("Instanz der Klasse1.");
    }

    protected void anzeige() {
        System.out.println(Klasse1.privatesFeld);
        System.out.println(Klasse1.geschuetztesFeld);
        System.out.println(Klasse1.oeffentlichedFeld);
        System.out.println(Klasse1.standardFeld);
    }
}
