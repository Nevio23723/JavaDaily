public class LoginSystem {
    private MyLogger logger = new MyLogger();
    public int versuche;
    private boolean KontoGesperrt = false;
    private String aktuellesPasswort = "admin123";

    public boolean isGesperrt() {
        return KontoGesperrt;
    }
    public void login(String passwort) {
        if (KontoGesperrt) {
            logger.logCriticalError("Konto gesperrt!");
            return;
        }
        if (passwort.equals(aktuellesPasswort)) {
            logger.logInfo("Login erfolgreich");
            versuche = 0;
        } else if (passwort.equals("hack")) {
            logger.logCriticalError("Sicherheitsalarm!");
        } else {
            logger.logWarning("Falsches Passwort versucht: " + passwort);
            versuche += 1;
        }
        if (versuche >= 3) {
            KontoGesperrt = true;
        }
    }

    public void passwortAendern(String altesPasswort, String neuesPasswort) {
        if (!altesPasswort.equals(aktuellesPasswort)) {
            logger.logWarning("Passwort ändern fehlgeschlagen: Altes Passwort falsch!");
            return;
        }
        if (neuesPasswort.length() <= 4) {
            logger.logWarning("Passwort ändern fehlgeschlagen: Neues Passwort zu kurz.");
            return;
        }
        if (altesPasswort.equals(aktuellesPasswort)) {
            aktuellesPasswort = neuesPasswort;
            logger.logInfo("Passwort wurde geändert.");
        }
    }
}