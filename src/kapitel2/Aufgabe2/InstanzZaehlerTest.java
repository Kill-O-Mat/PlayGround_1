/**
 * Beschreibung der Klasse InstanzZaehlerTest.
 *
 * @author Mathias
 * @version 1.0
 * @created 24.04.2025
 */
package kapitel2.Aufgabe2;

public class InstanzZaehlerTest {

    public static void main(String[] args) {
       Klasse1[] kArray = new Klasse1[5];
       kArray[0] = new Klasse1();
       kArray[1]= new Klasse2();
        kArray[2]= new Klasse2();
       for ( Klasse1 k :kArray) {
           if(k != null)  System.out.println("Instanzen: " + k.getAnzeigeZaehler());
        }
    }
}
