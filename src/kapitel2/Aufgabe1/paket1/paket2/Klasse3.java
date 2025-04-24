/**
 * Beschreibung der Klasse Klasse3.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe1.paket1.paket2;

public class Klasse3 extends Klasse2{
    Klasse3() {
        System.out.println("Instanz der Klasse3.");
    }

    public static void main (String[] args) {
        kapitel2.Aufgabe1.paket1.Klasse1 kl1 = new kapitel2.Aufgabe1.paket1.Klasse1();
        Klasse2 kl2 = new Klasse2();
        Klasse3 kl3 = new Klasse3();
        Klasse4 kl4 = new Klasse4();

        //kl1.anzeige();
        kl2.anzeige();
        kl3.anzeige();
        kl4.anzeige();
    }
}
