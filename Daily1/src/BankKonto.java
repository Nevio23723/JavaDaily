public class BankKonto
{
    double kontostand;

    public void einzahlen(double betrag)
    {
        kontostand += betrag;
        System.out.println(betrag + " CHF wurden eingezahlt.");
    }

    public void kontostandAnzeigen()
    {
        System.out.printf("Dein Kontostand: %.2f CHF%n", kontostand);
    }
}
