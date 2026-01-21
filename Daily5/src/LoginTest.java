public class LoginTest {

    public static void main(String[] args) {
        testErfolgreicherLogin();
        testSperreNachDreiFehlern();
    }

    // BEISPIEL: So sieht ein fertiger Test aus
    public static void testErfolgreicherLogin() {
        // 1. ARRANGE (Vorbereitung)
        LoginSystem system = new LoginSystem();

        // 2. ACT (Handlung)
        system.login("admin123");

        // 3. ASSERT (Prüfung)
        if (system.isGesperrt() == false) {
            System.out.println("Login-Test: Bestanden");
        } else {
            System.out.println("Login-Test: FEHLER! Sollte nicht gesperrt sein.");
        }
    }

    // DEINE AUFGABE: Diesen Test fertigstellen
    public static void testSperreNachDreiFehlern() {
        System.out.println("Teste Sperre...");

        // 1. ARRANGE
        LoginSystem system = new LoginSystem();

        // 2. ACT
        // AUFGABE: Simuliere hier, dass der User 3x das falsche Passwort eingibt.
        // Tipp: Rufe system.login(...) dreimal mit Quatsch auf.
        system.login("1234");
        system.login("1234");
        system.login("1234");

        // 3. ASSERT
        // AUFGABE: Prüfe jetzt: Ist das Konto gesperrt?
        // Nutze: if (system.isGesperrt() == true) { ... }
        // Gib einen grünen Haken aus, wenn es stimmt, und ein rotes Kreuz, wenn nicht.
        if (system.isGesperrt()) {
            System.out.println("Test bestanden");
        } else {
            System.out.println("Test Fehlgeschlagen");
        }
    }
}