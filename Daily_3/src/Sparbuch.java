public class Sparbuch {
    private double kapital;

    public Sparbuch(double startBetrag) {
        this.kapital = startBetrag;
    }

    public void berechneZinsen(int laufzeitJahre, double zinssatz) {
        for (int jahr = 1; jahr <= laufzeitJahre; jahr++) {
            double zinsen = kapital * (zinssatz / 100);
            kapital += zinsen;
            System.out.printf("Jahr %d: Zins %.2f CHF -> Neu: %.2f CHF%n", jahr, zinsen, kapital);
        }
    }

    public void berechneSparplan(int Jahre, double zinssatz, double sparRate) {
        for (int jahr = 1; jahr <= Jahre; jahr++) {
            double zinsen = kapital * (zinssatz / 100);
            kapital += zinsen;
            kapital += sparRate;
            System.out.printf("Jahr %d: Zins %.2f + Einz. %.2f -> Neu: %.2f CHF%n", jahr, zinsen, sparRate, kapital);
        }
    }
}
