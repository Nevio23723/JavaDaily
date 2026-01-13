public class Tresor
{
    private double guthaben;
    private int geheimzahl;
    private int falscheEingaben = 0;

    public Tresor(int meinePIN) {
        geheimzahl = meinePIN;

        guthaben = 0.0;
    }

    public void einzahlen(double betrag) {
        guthaben += betrag;
        System.out.printf(betrag + "eingeworfen. Neues Saldo:" + guthaben);
    }

    public void geldRausholen(double betrag, int pinEingabe) {
        if (falscheEingaben >=  3) { //nicht ==
            System.out.println("KONTO GESPERRT! POLIZEI KOMMT!");
            return;
        }


        if (geheimzahl == pinEingabe) {
            guthaben -= betrag;
            System.out.println(betrag + "wurde ausgezahlt. Neues Saldo:" + guthaben);
            falscheEingaben = 0;
        } else {
            falscheEingaben += 1;
            System.out.println("PIN Falsch");
        }
    }
}
