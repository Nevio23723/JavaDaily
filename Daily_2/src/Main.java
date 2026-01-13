//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Bonus Aufgabe :D

        //Erstelle einen Tresor
        Tresor meinTresor = new Tresor(1234);

        // Gib 3x eine falsche PIN ein.
        meinTresor.geldRausholen(100.0, 9999);
        meinTresor.geldRausholen(100.0, 9999);
        meinTresor.geldRausholen(100.0, 9999);

        // Gib beim 4. Mal die richtige PIN ein
        meinTresor.geldRausholen(100.0, 1234);





        // Aufgabe 1

        // Erstelle in einer Main-Klasse einen neuen Tresor mit der PIN 1234
        //Tresor meinTresor = new Tresor(1234);

        // Zahle 1000 Franken ein.
        //meinTresor.einzahlen(1000);

        //Versuche Geld mit der PIN 9999 zu holen (sollte scheitern)
        //meinTresor.geldRausholen(500.0, 9999);

        // Versuche Geld mit der PIN 1234 zu holen (sollte klappen)
        //meinTresor.geldRausholen(500.0, 1234);
    }
}