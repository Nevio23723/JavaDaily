import java.util.concurrent.ExecutionException;

public class BankKonto
{
    double kontostand;

    double dispoLimit = 100;

    public void einzahlen(double betrag)
    {
        kontostand += betrag;
        System.out.println(betrag + " CHF wurden eingezahlt.");
    }

    public void kontostandAnzeigen()
    {
        System.out.printf("Dein Kontostand: %.2f CHF%n", kontostand);
    }

    public boolean abheben(double betrag)
    {
        if (kontostand + dispoLimit >= betrag ) {
            kontostand -= betrag;
            return true;
        } else {
            System.out.println("Saldo zu klein!");
            return false;
        }
    }
}
