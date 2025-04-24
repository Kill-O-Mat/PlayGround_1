/**
 * Beschreibung der Klasse Klasse1.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe2;

public class Klasse1 {
    private static int zaehlersupkls;
    public Klasse1() {
        Klasse1.zaehlersupkls++;
    }

    public int getAnzeigeZaehler() {
        System.out.println("Aufruf aus Klasse1.");
        return Klasse1.zaehlersupkls;
    }
}
