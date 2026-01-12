//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // neues Konto
        BankKonto konto = new BankKonto();
        konto.kontostandAnzeigen();

        // Dispo methode
        konto.abheben(50.00);
        konto.kontostandAnzeigen();

        // Dispo Limit
        konto.abheben(51.00);

    }
}