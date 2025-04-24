/**
 * Beschreibung der Klasse Klasse2.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe1.paket1.paket2;


public class Klasse2 extends kapitel2.Aufgabe1.paket1.Klasse1 {
    Klasse2() {
        System.out.println("Instanz der Klasse 2");
    }
    @Override
    protected void anzeige() {
        super.anzeige();
        System.out.println("loli");
    }
}
