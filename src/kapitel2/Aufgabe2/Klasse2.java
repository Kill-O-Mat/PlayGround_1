/**
 * Beschreibung der Klasse Klasse2.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe2;

public class Klasse2 extends Klasse1{
    private static int zahlerSupkls;

    public Klasse2() {
       Klasse2.zahlerSupkls++;
    }

    @Override
    public int getAnzeigeZaehler() {
        System.out.println("Aufruf aus Klasse2.");
        // return super.getAnzeigeZaehler();
     return Klasse2.zahlerSupkls;
    }
}
